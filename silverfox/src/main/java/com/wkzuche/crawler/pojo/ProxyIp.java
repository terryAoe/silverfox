package com.wkzuche.crawler.pojo;

public class ProxyIp {

	private String ip ;
	private String port ;
	private String resource;
	
	private String fetchDate;
	
	public ProxyIp(){
		
	}
	
	
	
	public ProxyIp(String ip, String port, String resource, String fetchDate) {
		super();
		this.ip = ip;
		this.port = port;
		this.resource = resource;
		this.fetchDate = fetchDate;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getFetchDate() {
		return fetchDate;
	}

	public void setFetchDate(String fetchDate) {
		this.fetchDate = fetchDate;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ip == null) ? 0 : ip.hashCode());
		result = prime * result + ((port == null) ? 0 : port.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProxyIp other = (ProxyIp) obj;
		if (ip == null) {
			if (other.ip != null)
				return false;
		} else if (!ip.equals(other.ip))
			return false;
		if (port == null) {
			if (other.port != null)
				return false;
		} else if (!port.equals(other.port))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "ProxyIp [ip=" + ip + ", port=" + port + ", resource=" + resource + ", fetchDate=" + fetchDate + "]";
	}
	
	
	
	

}
