package com.wkzuche.crawler.pageprocessor;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

public class XiCiPageProcessor implements PageProcessor {
	private Site xiciSite = Site.me().
			setUserAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.63 Safari/537.36").
			setRetryTimes(2).setRetrySleepTime(2000)
			;
	public XiCiPageProcessor() {
		
	}

	public void process(Page page) {
		
	}

	public Site getSite() {
		return xiciSite;
	}

}
