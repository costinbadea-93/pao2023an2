package comparators.model;

import java.util.Comparator;

public class LibraryComparator implements Comparator<Library> {
    @Override
    public int compare(Library o1, Library o2) {
        return
                o1.getName().compareTo(o2.getName());
    }
}
