package quartztest;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class MyJob2  extends QuartzJobBean  {

	@Override
	public void executeInternal(JobExecutionContext jec) throws JobExecutionException {
		//执行任何实际任务，包括数据库操作
//		System.out.println("任务执行了，当前时间为："+new Date());
		System.out.println("我的简单任务执行了，当前调用时间为:"+jec.getFireTime()+",下一个任务时间为:"+jec.getNextFireTime());
	}

}
