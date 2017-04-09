package test;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.calendar.AnnualCalendar;

import quartztest.MyJob;

public class Test2 {
	public static void main(String[] args) throws SchedulerException, InterruptedException, ParseException {
		JobDetail detail = new JobDetail("myJob1", "oaGroup", MyJob.class);

		AnnualCalendar calendar = new AnnualCalendar();
		Calendar instance = Calendar.getInstance();
		instance.set(2017, 1, 1, 0, 0, 0);
		calendar.setDayExcluded(instance, true);
		
		
		Trigger trigger = new CronTrigger( "myTrigger","oaGroup","* * * * * ?");
		

		//���������
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		scheduler.addCalendar("myCal",calendar,true,true);
		
		
		//������ʹ�������
		scheduler.scheduleJob(detail, trigger);
		
		//��ʼ�������
		scheduler.start();
		
		
		Thread.sleep(20000);
		//�رյ�����
		scheduler.shutdown();
		
		
		
				
	}
}
