package AimsProject.src.hust.soict.globalict.aims.media.comparator;

import AimsProject.src.hust.soict.globalict.aims.media.Media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media o1, Media o2){
        Double cost1 = o1.getCost();
        Double cost2 = o1.getCost();
        int Comp = cost1.compareTo(cost2);
        if (Comp != 0) {
            return Comp;
        }
        String title1 = o1.getTitle();
        String title2 = o2.getTitle();
        return title1.compareTo(title2);
    }
}