

public class FilterAdapter implements FilterStrategy{

	ImplNonStandard implNonStandard;
	@Override
	public int[] filter(int[] image) {
		implNonStandard=new ImplNonStandard();
		
		return implNonStandard.appliquerFilter(image);
	}

}
