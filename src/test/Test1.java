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
		
		//��������Ϊ�����֡��顢�����ظ����������
		Trigger trigger = new SimpleTrigger("myTrigger", "oaGroup", SimpleTrigger.REPEAT_INDEFINITELY, 3000);
		
		//��������Ϊ�����֡��顢���������ʱ��
//		SimpleTrigger trigger = new SimpleTrigger("myTrigger", "oaGroup", 2, 3000);
		
		//�����������Ϊ�����֡���ʼʱ�䡢����ʱ�䡢�ظ����������
//		SimpleTrigger trigger = new SimpleTrigger("MyTrigger",new Date(),new Date(new Date().getTime()+10000),100,2000);
		

		//���������
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		
		//������ʹ�������
		scheduler.scheduleJob(detail, trigger);
		
		//��ʼ�������
		scheduler.start();
		
		
		Thread.sleep(100000);
		//�رյ�����
		scheduler.shutdown();
		
		
		
				
	}
}
