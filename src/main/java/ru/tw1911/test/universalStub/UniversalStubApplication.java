package ru.tw1911.test.universalStub;

import com.ibm.mq.jms.MQQueueConnectionFactory;
import com.ibm.msg.client.wmq.WMQConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
@EnableJms
public class UniversalStubApplication {

	@Value("${ibm.mq.connHost}")
	private String host;
	@Value("${ibm.mq.connPort}")
	private Integer port;
	@Value("${ibm.mq.queueManager}")
	private String queueManager;
	@Value("${ibm.mq.channel}")
	private String channel;
	@Value("${jms.stub.queueIn}")
	private String queueData;
	@Value("${jms.stub.queueOut}")
	private String queueStatus;
	@Value("${ibm.mq.user}")
	private String user;
	@Value("${ibm.mq.password}")
	private String password;

	@Autowired
	private JmsTemplate jmsTemplate;

	public static void main(String[] args) {
		SpringApplication.run(UniversalStubApplication.class, args);
	}

	@Bean
	public MQQueueConnectionFactory mqQueueConnectionFactory() {
		MQQueueConnectionFactory mqQueueConnectionFactory = new MQQueueConnectionFactory();
		try {
			System.out.println(host + " " + port + " " + queueManager + " " + channel + " " + user + " " + password);
			mqQueueConnectionFactory.setHostName(host);
			mqQueueConnectionFactory.setQueueManager(queueManager);
			mqQueueConnectionFactory.setPort(port);
			mqQueueConnectionFactory.setChannel(channel);
			mqQueueConnectionFactory.setTransportType(WMQConstants.WMQ_CM_CLIENT);
			mqQueueConnectionFactory.setCCSID(1208);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mqQueueConnectionFactory;
	}
}
