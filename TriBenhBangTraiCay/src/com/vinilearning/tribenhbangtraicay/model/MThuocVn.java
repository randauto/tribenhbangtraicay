package com.vinilearning.tribenhbangtraicay.model;

public class MThuocVn {
	private final String tenbai;
	private final String urlTenBai;
	private boolean isBookmark = false;

	public String getTenbai() {
		return tenbai;
	}

	public String getUrlTenBai() {
		return urlTenBai;
	}

	public boolean isBookmarked() {
		return isBookmark;
	}

	private MThuocVn(ThoVnBuilder builder) {
		this.tenbai = builder.tenbai;
		this.urlTenBai = builder.urlTenBai;
		this.isBookmark = builder.isBookmark;
	}

	public static class ThoVnBuilder {
		private String tenbai;
		private String urlTenBai;
		private boolean isBookmark;

		public ThoVnBuilder(String tenbai, String urlTenBai) {
			this.tenbai = tenbai;
			this.urlTenBai = urlTenBai;
		}

		public ThoVnBuilder setBookmark(boolean isBookmark) {
			this.isBookmark = isBookmark;
			return this;
		}

		public ThoVnBuilder setTenBai(String tenbai) {
			this.tenbai = tenbai;
			return this;
		}

		public ThoVnBuilder setUrlTenBai(String urlTenBai) {
			this.urlTenBai = urlTenBai;
			return this;
		}

		public MThuocVn build() {
			return new MThuocVn(this);
		}

	}
}
