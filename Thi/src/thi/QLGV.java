package thi;

import java.util.ArrayList;

public class QLGV implements Interface_GV {

    private ArrayList<Giao_Vien> dsgv;

    public QLGV() {
        this.dsgv = new ArrayList<>();
    }

    @Override
    public void insert(Giao_Vien gv) {
        this.dsgv.add(gv);
    }

    @Override
    public void delete(int viTri) {
        this.dsgv.remove(viTri);
    }

    @Override
    public Giao_Vien select(int viTri) {
        return this.dsgv.get(viTri);
    }

    @Override
    public ArrayList display() {
        return this.dsgv;
    }

    @Override
    public void createObj() {
        Giao_Vien gv1 = new Giao_Vien("Nam", "UDPM", 6000);
        Giao_Vien gv2 = new Giao_Vien("Hậu", "TKDH", 3000);
        Giao_Vien gv3 = new Giao_Vien("Duy", "TKTW", 10000);
        insert(gv1);
        insert(gv2);
        insert(gv3);
    }

}
