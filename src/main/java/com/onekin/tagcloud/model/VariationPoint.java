package com.onekin.tagcloud.model;

public class VariationPoint {

	private Integer id;
	private Integer linesAdded;
	private Integer linesDeleted;
	private Integer coreAssetId;
	private String coreAssetName;

	public VariationPoint() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VariationPoint(Integer id, Integer linesAdded, Integer linesDeleted, String coreAssetName, Integer coreAssetId) {
		super();
		this.id = id;
		this.linesAdded = linesAdded;
		this.linesDeleted = linesDeleted;
		this.coreAssetName = coreAssetName;
		this.coreAssetId = coreAssetId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLinesAdded() {
		return linesAdded;
	}

	public void setLinesAdded(Integer linesAdded) {
		this.linesAdded = linesAdded;
	}

	public Integer getLinesDeleted() {
		return linesDeleted;
	}

	public void setLinesDeleted(Integer linesDeleted) {
		this.linesDeleted = linesDeleted;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		VariationPoint other = (VariationPoint) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VariationPoint [id=");
		builder.append(id);
		builder.append(", linesAdded=");
		builder.append(linesAdded);
		builder.append(", linesDeleted=");
		builder.append(linesDeleted);
		builder.append("]");
		return builder.toString();
	}

	public String getCoreAssetName() {
		return coreAssetName;
	}

	public void setCoreAssetName(String coreAssetName) {
		this.coreAssetName = coreAssetName;
	}

	public Integer getCoreAssetId() {
		return coreAssetId;
	}

	public void setCoreAssetId(Integer coreAssetId) {
		this.coreAssetId = coreAssetId;
	}

}
