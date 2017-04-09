package test;

import java.text.ParseException;
import java.util.Date;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.scheduling.support.CronTrigger;


import quartztest.MyJob;

public class Test3 {
	public static void main(String[] args) throws SchedulerException, InterruptedException, ParseException {
		JobDetail detail = new JobDetail("myJob1", "oaGroup", MyJob.class);
		
		Trigger trigger = new org.quartz.CronTrigger("myTrigger", "oaGroup", "* * * * * ?");

		//���������
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		
		//������ʹ�������
		scheduler.scheduleJob(detail, trigger);
		
		//��ʼ�������
		scheduler.start();
		
		
		Thread.sleep(20000);
		//�رյ�����
		scheduler.shutdown();
		
		
		
				
	}
}
