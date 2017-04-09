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

		//任务调度器
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		
		//将任务和触发器绑定
		scheduler.scheduleJob(detail, trigger);
		
		//开始任务调度
		scheduler.start();
		
		
		Thread.sleep(20000);
		//关闭调用器
		scheduler.shutdown();
		
		
		
				
	}
}
