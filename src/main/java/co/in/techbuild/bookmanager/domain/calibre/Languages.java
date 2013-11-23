package co.in.techbuild.bookmanager.domain.calibre;

public class Languages {

	private String id;
	private String lang_code;

	public Languages() {
	}

	public Languages(String id, String lang_code) {
		super();
		this.id = id;
		this.lang_code = lang_code;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLang_code() {
		return lang_code;
	}

	public void setLang_code(String lang_code) {
		this.lang_code = lang_code;
	}

	@Override
	public String toString() {
		return "Languages [id=" + id + ", lang_code=" + lang_code + "]";
	}

}
