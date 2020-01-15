package com.lojaAjax.lojaajax.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SocialMetaTag implements Serializable {

	private String site;
	private String title;
	private String url;
	private String imageUrl;
	
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	
}
