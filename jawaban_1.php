<?php
// buat class triana
class triana {
   // buat method biodata
	
   public function biodata($name, $age, $address, $hobbies, $is_married, $list_school, $skills,$interest_in_coding) {   
	 echo json_encode($name);
	 echo json_encode($age);
	 echo json_encode($address);
	 echo json_encode($hobbies);
	 echo json_encode($is_married);
	 echo json_encode($list_school);
	 echo json_encode($skills);
	 echo json_encode($interest_in_coding);
   }
}
$biodata_triana = new triana();
$name = "Triana Afriani HE";
$age = 22;
$address = "Palembang";
$hobbies = array("Membuat video animasi", "Menonton drama", "Membaca buku");
$is_married = false;
$list_school =[['name'=>'SD Negeri 1 Kayuagung', 'year_in'=>2004, 'year_out'=>2009, 'major'=>null],
						   ['name'=>'SMP Negeri 1 Kayuagung', 'year_in'=>2009, 'year_out'=>2012, 'major'=>null],
						   ['name'=>'SMA Negeri 1 Kayuagung', 'year_in'=>2012, 'year_out'=>2015, 'major'=>'IPA'],
						   ['name'=>'STMIK GI MDP', 'year_in'=>2015, 'year_out'=>2019, 'major'=>'Teknik Informatika']];
$skills = [['skill_name'=>'2D animate', 'level'=>'advance'],
					   ['skill_name'=>'Mobile programming', 'level'=>'advance'],
					   ['skill_name'=>'Game programming', 'level'=>'advance']];
$interest_in_coding = true;
$biodata_triana->biodata($name, $age, $address, $hobbies, $is_married, $list_school, $skills,$interest_in_coding);

?>