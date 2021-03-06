package tb.domain;

import java.util.Set;

import tb.domain.maparea.MapArea;

public class Partner {

	private Long id;
	private String uuid;
	private String apiId;
	private String apiKey;
	private String name;
	private String apiurl;
	private Set<MapArea> mapAreas;
	private String timezoneId;
	private String comment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApiurl() {
		return apiurl;
	}

	public void setApiurl(String apiurl) {
		this.apiurl = apiurl;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Set<MapArea> getMapAreas() {
		return mapAreas;
	}

	public void setMapAreas(Set<MapArea> mapAreas) {
		this.mapAreas = mapAreas;
	}

	public String getTimezoneId() {
		return timezoneId;
	}

	public void setTimezoneId(String timezoneId) {
		this.timezoneId = timezoneId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
