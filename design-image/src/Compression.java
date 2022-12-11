

public abstract class Compression {
	
	public int[] compresserTemplate(int[] image) {
		image=compresser1(image);
		image=compresser2(image);
		return image;
	}
	
	public abstract int[] compresser1(int[] image);
	public abstract int[] compresser2(int[] image);

}
