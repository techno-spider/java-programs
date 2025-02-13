package collection;

import java.util.Objects;

public class ObjectAsKey {

    private int id;
    private String name;

    public ObjectAsKey(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ObjectAsKey myKey = (ObjectAsKey) o;
        return id == myKey.id && Objects.equals(name, myKey.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "ObjectAsKey{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
