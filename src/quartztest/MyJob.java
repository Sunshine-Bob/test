package quartztest;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MyJob implements Job {

	@Override
	public void execute(JobExecutionContext jec) throws JobExecutionException {
		//ִ���κ�ʵ�����񣬰������ݿ����
//		System.out.println("����ִ���ˣ���ǰʱ��Ϊ��"+new Date());
		System.out.println("�ҵļ�����ִ���ˣ���ǰ����ʱ��Ϊ:"+jec.getFireTime()+",��һ������ʱ��Ϊ:"+jec.getNextFireTime());
	}

}
