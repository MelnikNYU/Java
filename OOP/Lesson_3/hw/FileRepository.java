package OOP.Lesson_3.hw;

import java.util.ArrayList;
import java.util.List;

public class FileRepository<T extends File> {
    List<T> ds;

    private String name;

    public FileRepository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n  >>  %s created\n",this.name);
    }

    // public void save(T file) {
    //     ds.save(file);
    // }

    public void add(T file) {
        ds.add(file);
    }

    // public void reply(T file) {
    //     ds.reply(file);
    // }

    public void remove(T file) {
        ds.remove(file);
    }

    public int count() {
        return ds.size();
    }

    public T get(Integer index) {
        return ds.get(index);
    }
}

