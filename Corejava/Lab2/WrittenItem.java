package Lab2;

public abstract class WrittenItem extends Item {
	private String author;

	public WrittenItem(int ino, String copies, int no, String author) {
		super(ino, copies, no);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "WrittenItem [author=" + author + "]";
	}
}
