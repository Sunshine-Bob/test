package test;

import java.util.Date;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

import quartztest.MyJob;

public class Test1 {
	public static void main(String[] args) throws SchedulerException, InterruptedException {
		JobDetail detail = new JobDetail("myJob1", "oaGroup", MyJob.class);
		
		//参数依次为：名字、组、无限重复次数、间隔
		Trigger trigger = new SimpleTrigger("myTrigger", "oaGroup", SimpleTrigger.REPEAT_INDEFINITELY, 3000);
		
		//参数依次为：名字、组、次数、间隔时间
//		SimpleTrigger trigger = new SimpleTrigger("myTrigger", "oaGroup", 2, 3000);
		
		//构造参数依次为：名字、开始时间、结束时间、重复次数、间隔
//		SimpleTrigger trigger = new SimpleTrigger("MyTrigger",new Date(),new Date(new Date().getTime()+10000),100,2000);
		

		//任务调度器
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		
		//将任务和触发器绑定
		scheduler.scheduleJob(detail, trigger);
		
		//开始任务调度
		scheduler.start();
		
		
		Thread.sleep(100000);
		//关闭调用器
		scheduler.shutdown();
		
		
		
				
	}
}
