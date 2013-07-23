package com.cs2c.dvs.timer;

/**
 * 新闻栏目定时器任务
 * 
 * @author 
 * 
 */
public class QuartzOSNewsJob extends QuartzJob {

	@Override
	public void work() {

		// 调用RssBean解析出每个新闻的link
		try {
			super.getRssBean().rss_openstackNews();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
