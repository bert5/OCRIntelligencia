package fr.inteligenciaArtificial;

import java.util.HashMap;
import java.util.List;

public class Multimap extends HashMap<Character, List<Image>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public List<Image> put(Character key, Image value) {
		List<Image> listImagesParent = super.get(key);
		if(listImagesParent.isEmpty() || !listImagesParent.contains(value)) {
			super.remove(key);
			listImagesParent.add(value);
			listImagesParent = super.put(key, listImagesParent);
		}
		return listImagesParent;
	}
	
	public List<Image> remove(Character key, Image value) {
		List<Image> listImagesParent = super.get(key);
		return listImagesParent;
	}
	
	

}
