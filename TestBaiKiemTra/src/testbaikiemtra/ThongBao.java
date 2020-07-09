/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbaikiemtra;

/**
 *
 * @author huuph
 */
public class ThongBao {
    private static ThongBao tb;
    String tieuDe;
    String icon;
    String noiDung;
    String ungDung;
    
    public ThongBao() {
    }

    protected ThongBao(Builder builder) {
        this.tieuDe = builder.tieuDe;
        this.icon = builder.icon;
        this.noiDung = builder.noiDung;
        this.ungDung = builder.ungDung;
    }

    public ThongBao(String tieuDe, String icon, String noiDung, String ungDung) {
        this.tieuDe = tieuDe;
        this.icon = icon;
        this.noiDung = noiDung;
        this.ungDung = ungDung;
    }
    
    
    
    public static class Builder{
        ThongBao thongBao;
        String tieuDe;
        String icon;
        String noiDung;
        String ungDung;
        public Builder addTieuDe(String tieuDe){
            this.tieuDe = tieuDe;
            return this;
        }
        public Builder addIcon(String icon){
            this.icon = icon;
            return this;
        }
        public Builder addNoiDung(String noiDung){
            this.noiDung = noiDung;
            return this;
        }
        public Builder addUngDung(String ungDung){
            this.ungDung = ungDung;
            return this;
        }
        public Builder(){
            
        }
        public ThongBao build(){
            return new ThongBao(this);
        }

        
    }
    public static ThongBao CreateInstance(){
        if(tb == null){
            tb = new ThongBao();
        }
        return tb;
    }
    @Override
    public String toString() {
        return "Builder{" + "tieuDe = " + tieuDe + ", icon = " + icon + ", noiDung = " + noiDung + ", ungDung = " + ungDung + '}';
    }
    public void setThongBao(ThongBao tb){
        this.icon = tb.icon;
        this.tieuDe = tb.tieuDe;
        this.noiDung = tb.noiDung;
        this.ungDung = tb.ungDung;
    }

    
}
