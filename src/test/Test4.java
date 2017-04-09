package test;

import java.text.ParseException;
import java.util.Date;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import quartztest.MyJob;

public class Test4 {
	public static void main(String[] args) throws SchedulerException, InterruptedException, ParseException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		
		
				
	}
}
