public class LatihanDaoImpl implements LatihanDao{
	public void save (Latihan l){
		System.out.println("Menyimpan latihan");
	}
	public void delete (Latihan l){
		System.out.println("Menghapus latihan");
	}
	public Latihan getById(Long id){
		Latihan l = new Latihan();
		l.setId(id);
		l.setNama("abc");
		return l;
	}
}