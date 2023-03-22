package Iterator;

public class NameRepository implements JecnaContainer {
    public String[] names = {"Petr", "Karel", "Honza"};

    @Override
    public JecnaIterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements JecnaIterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
