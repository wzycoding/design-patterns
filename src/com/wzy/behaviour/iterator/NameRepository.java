package com.wzy.behaviour.iterator;

/**
 * description: NameRepository <br>
 * date: 2020-06-11 10:48 <br>
 * author: wzy <br>
 * version: 1.0 <br>
 */
public class NameRepository implements Container {

    public String names[] = {"Robert", "John", "Julie", "Lora"};
    @Override
    public Iterator getIterator() {
       return new NameIterator();
    }

    private class NameIterator implements Iterator {
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
