package quartztest;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class MyJob2  extends QuartzJobBean  {

	@Override
	public void executeInternal(JobExecutionContext jec) throws JobExecutionException {
		//ִ���κ�ʵ�����񣬰������ݿ����
//		System.out.println("����ִ���ˣ���ǰʱ��Ϊ��"+new Date());
		System.out.println("�ҵļ�����ִ���ˣ���ǰ����ʱ��Ϊ:"+jec.getFireTime()+",��һ������ʱ��Ϊ:"+jec.getNextFireTime());
	}

}
