

public class FilterBlackWhite implements FilterStrategy{

	@Override
	public int[] filter(int[] image) {
		for(int i=0;i<image.length;i++) {
			image[i]=image[i]>127?255:0;
		}
		return image;
	}

}
