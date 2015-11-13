package com.midoctor.proyectdoc2;


import java.util.ArrayList;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListaMedicosActivity extends Activity {
	private  ListView ListViewopction;
	private ArrayList<classespecialidades> fetch = new ArrayList<classespecialidades>();
	private adapterdirectorio adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista_medicos);
		
		
		ListViewopction = (ListView) findViewById(R.id.listView2);
		
		
		 Bundle extras = getIntent().getExtras();
		 String especialidad = extras.getString("especialidad");
		 TextView tv_title = (TextView) findViewById(R.id.tv_header);
		ImageView img = (ImageView) findViewById(R.id.icono_mascota);
		TextView tv_content = (TextView) findViewById(R.id.doc_info);
		TextView texto = (TextView) findViewById(R.id.texto);

		 if(especialidad.equals("alergologo")){
				tv_title.setText("Alergólogo");
				img.setBackgroundResource(R.drawable.mascota_alergologo);
				tv_content.setText("Es el médico especializado en el diagnóstico y tratamiento de las enfermedades  alérgicas, así como alergia a medicamentos y alimentos. Enfermedades que trata: Rinitis alérgica, asma, urticaria. Dermatitis alérgica, alergia a insectos");
				texto.setText("Conoce a nuestros alergólogogos:");
				classespecialidades one = new
						classespecialidades("1","Dr. Francisco Navarrete Suárez","Alergólogo","8981927","alergiadecancun@yahoo.com.mx",especialidad,"21.13655", "-86.827488",
						"Av. Tulum Lote 1 mza 1 consultorio 203  SM 12 Hospital Galenia. CP 77505  \n\nServicios: Pacientes con alergias, pruebas de alergia, espirometrias, vacunas para alergia y vacunas complementarias de la cartilla de vacunacion."
								,"");
							
				classespecialidades one1 = new 
						classespecialidades("2","Dra. Aurora Meza Morales","Alergólogo","8981927","alergiaypediatria@yahoo.com.mx",especialidad,"21.13655", "-86.827488",
						"Av. Tulum lote 1 mza 1 consultorio 203 SM 12  Hospital Galenia. CP 77505",
						"");
				fetch.add(one);
				fetch.add(one1);
		 }
		 else if(especialidad.equals("audiologo")){
				tv_title.setText("Audiológo");
				img.setBackgroundResource(R.drawable.mascota_audiologo);
				tv_content.setText("Es el médico especializado en el tratamiento, diagnóstico y rehabilitación de los problemas y discapacidades auditivas. \n Enfermedades que trata:  otitis media, zumbido de oídos, perdida de la audición, vértigo, mareo.");
		 }else if(especialidad.equals("cardiologo")){
				tv_title.setText("Cardiólogo");
				img.setBackgroundResource(R.drawable.mascota_cardio);
				tv_content.setText("El cardiólogo es el especialista médico encargado de atender las enfermedades relacionadas con el corazón y el aparato circulatorio. Enfermedades que trata: hipertensión arterial, insuficiencia cardiaca, pericarditis, endocarditis.");
		 }else if(especialidad.equals("cirujano")){
				tv_title.setText("Cirujano");
				img.setBackgroundResource(R.drawable.mascota_cirujano);
				tv_content.setText("Médico especialista  en  prevenir,  diagnosticar y curar diversos padecimientos a través de la realización de cirugías.\n Padecimientos quirúrgicos: Dependiendo del aparato ó sistema afectado es el especialista en realizar cirugías.");
		 }else if(especialidad.equals("dermatologo")){
				tv_title.setText("Dermatólogo");
				img.setBackgroundResource(R.drawable.mascota_dermatologo);
				tv_content.setText("Es el médico especializado en los padecimientos de la piel, ofrece diagnóstico, prevención y tratamiento.\n Enfermedades que trata:  acné, dermatitis, comezón.");
				texto.setText("Conoce a nuestros dermatologos:");
				classespecialidades one = new
						classespecialidades("1","Dra. Araceli de la Torre Plasencia","Dermatologa","998 898 26 47 ","lucet2009@hotmail.com",especialidad,"21.1438223", "-86.8313818",
						"Pabellón Caribe","");
				fetch.add(one);
		 }else if(especialidad.equals("endocrinologo")){
				tv_title.setText("Endocrinólogo");
				img.setBackgroundResource(R.drawable.mascota_endocrinologo);
				tv_content.setText("Es el médico especializado en las enfermedades hormonales, del metabolismo y de los problemas alimenticios o de nutrición. Enfermedades que trata: diabetes, menopausia, obesidad.");
		 }else if(especialidad.equals("gastro")){
				tv_title.setText("Gastroenterólogo");
				img.setBackgroundResource(R.drawable.mascota_gastro);
				tv_content.setText("Médico especialista en tratar  y prevenir enfermedades  de tubo digestivo. Enfermedades que trata: Gastritis, esofagitis, colon irritable, problemas del hígado , problemas de digestión.");
				texto.setText("Conoce a nuestros gastroenterólogos:");
				classespecialidades one = new
						classespecialidades("1","Dr. Raúl Barragán Parrao","Gastroenterólogo","998 8980801","raulbapa@hotmail.com",especialidad,"21.13655", "-86.827488",
						"Av Tulum Lote 1 mza 1  consultorio  315      SM 12 Hospital Galenia CP. 77505","www.gastroenterologiacancun.com");
				classespecialidades one1 = new
						classespecialidades("1","Dr. Jorge Treviño","Gastroenterólogo","998 267 74 04","antiobesity@hotmail.com",especialidad,"21.1362757", "-86.829636",
						"Hospital Galenia","");
				fetch.add(one);
				fetch.add(one1);
				
		 }else if(especialidad.equals("ginecologo")){
				tv_title.setText("Ginecólogo");
				img.setBackgroundResource(R.drawable.mascota_ginecologo);
				tv_content.setText("Gineco-obstetra: es el especialista médico encargado del proceso del embarazo, del parto, del puerperio y del tiempo posterior al parto. Enfermedades que trata: enfermedades del adolescente, mujer adulta, y todos aspectos de la salud femenina.");
		 }else if(especialidad.equals("hematologo")){
				tv_title.setText("Hematólogo");
				img.setBackgroundResource(R.drawable.mascota_hematologo);
				tv_content.setText("Es el especializado médico encargado del diagnóstico y tratamiento de las enfermedades y trastornos de la sangre. Enfermedades que trata: leucemia, anemia, linfomas, trastornos hemorrágicos.");
		 }else if(especialidad.equals("inmunologo")){
				tv_title.setText("Inmunólogo");
				img.setBackgroundResource(R.drawable.mascota_inmunologo);
				tv_content.setText("Es el médico especializado en estudiar el sistema inmunitario, es decir todo lo relacionado con las defensas de nuestro organismo.\n Enfermedades que trata: lupus, artritis ,vasculitis, anemia.");
		 }else if(especialidad.equals("neurocirujano")){
				tv_title.setText("Neurocirujano");
				img.setBackgroundResource(R.drawable.mascota_neurocirujano);
				tv_content.setText("Es el profesional especializado en la cirugía del cerebro y la columna vertebral. Enfermedades que trata: neurocisticercosis, tumores cebarles, hernias de disco.");
		 }else if(especialidad.equals("neumologo")){
				tv_title.setText("Neumólogo");
				img.setBackgroundResource(R.drawable.mascota_neumologo);
				tv_content.setText("Es el médico especializado en el estudio de las enfermedades del aparato respiratorio. Enfermedades que trata: bronquitis, enfisema pulmonar, neumonía, fibrosis quística.");
		 }else if(especialidad.equals("neurologo")){
				tv_title.setText("Neurólogo");
				img.setBackgroundResource(R.drawable.mascota_neurologo);
				tv_content.setText("Es el especialista médico encargado de monitorizar y tratar los trastornos del sistema nervioso. Enfermedades que trata: cefalea (dolor de cabeza), alzheimer, trastornos de aprendizaje.");
		 }else if(especialidad.equals("nutriologo")){
				tv_title.setText("Nutriólogo");
				img.setBackgroundResource(R.drawable.mascota_gastroenterologo);
				tv_content.setText("Es el profesional de la salud, dedicado al estudio de la alimentación del ser humano y nos brinda las herramientas para tener una buena alimentación. Enfermedades que trata: personas sanas que desean tener una alimentación balanceada, obesidad, desnutrición.");
		 }else if(especialidad.equals("odontologo")){
				tv_title.setText("Odontólogo");
				img.setBackgroundResource(R.drawable.mascota_odontologo);
				tv_content.setText("Rama de la ciencia de la salud dedicada a la prevención ,diagnóstico y tratamiento  de dientes y encías. Enfermedades que trata : caries , mal oclusión , limpieza dental , corrección de superposición de dientes.");
				texto.setText("Conoce a nuestros odontólogos:");
				classespecialidades one = new
						classespecialidades("1","Dra. Mónica Callejo","Cirujana Dentista","","monica_callejo@hotmail.com",especialidad,"21.136610", "86.827509",
						"Hospital Galenia consultorio 203-2 Av. tulum  mz 01 lote 01 SM 12 Cancún, Quintana Roo. CP. 77505  \n\n ODONTOLOGIA ESTETICA Y PREVENTIVA \n FACULTAD DE ODONTOLOGIA UNAM \n CEDULA PROFESIONAL 2163854 \n CERTIFICADA ADM E.C-0403-01/1 \n *odontologia preventiva \n *odontologia estetica \n *implantes dentales \n *emergencias dentales \n twitter @CdMonica \n facebook: Dra. Monica Callejo Mi dentista Cancun"
								,"");
							
				fetch.add(one);
		 }else if(especialidad.equals("oncologo")){
				tv_title.setText("Oncólogo");
				img.setBackgroundResource(R.drawable.mascota_oncologo);
				tv_content.setText("Es el especialista médico encargado del análisis, diagnóstico y tratamiento del cáncer. Enfermedades que trata: cáncer de mama, cáncer de pulmón, cáncer de colon.");
		 }else if(especialidad.equals("ortopedista")){
				tv_title.setText("Ortopedista");
				img.setBackgroundResource(R.drawable.mascota_ortopedista);
				tv_content.setText("Es el médico especializado en la prevención y tratamiento de las afecciones o traumas de huesos y músculos. Enfermedades que trata:  fracturas, artritis, tendosinovitis estenosante, distensión muscular.");
				texto.setText("Conoce a nuestros ortopedistas:");
				classespecialidades one = new
						classespecialidades("1","Armando Mantecón","Ortopedista"," (998) 884 94 68","doctor@armandomantecon.com",especialidad,"21.1446722", "-86.8246716",
						"Hospital Amerimed Cancun, S.A de C.V","www.armandomantecon.com");
							
				fetch.add(one);
		 }else if(especialidad.equals("otorrino")){
				tv_title.setText("Otorrinolaringólogo");
				img.setBackgroundResource(R.drawable.mascota_otorrino);
				tv_content.setText("médico especialista enfocado a las enfermedades de oídos, nariz y garganta. Enfermedades que trata: otitis , rinitis, laringitis , traqueítis, desviación septal, pólipos nasales.");
		 }else if(especialidad.equals("psicologo")){
				tv_title.setText("Psicólogo");
				img.setBackgroundResource(R.drawable.mascota_psicologo);
				tv_content.setText("Es el profesional médico especializado en la salud mental. Enfermedades que trata: anorexia, apatía, demencia, depresión.");
		 }else if(especialidad.equals("reumatologo")){
				tv_title.setText("Reumatólogo");
				img.setBackgroundResource(R.drawable.mascota_reumatologo);
				tv_content.setText("El reumatólogo es el médico especialista encargado del diagnóstico y atención de las enfermedades relacionadas con el aparato locomotor es decir con cualquier malestar del cuerpo. Enfermedades que trata: artritis, osteoporosis, fibromialgia entre otras.");
		 }else if(especialidad.equals("terapiaped")){
				tv_title.setText("Terapia Intensiva Pediátrica");
				img.setBackgroundResource(R.drawable.mascota_terapia_intensiva);
				tv_content.setText("Pediatra especialista en atender a todo niño en estado de terapia intensiva.");
		 }else if(especialidad.equals("urgenciasped")){
				tv_title.setText("Urgencias Pediátricas");
				img.setBackgroundResource(R.drawable.mascota_urgencias_pediatricas);
				tv_content.setText("Pediatra especialista en atender a todo niño que llegue a  cualquier servicio de urgencias");
		 }else if(especialidad.equals("urologo")){
				tv_title.setText("Urólogo");
				img.setBackgroundResource(R.drawable.mascota_urologo);
				tv_content.setText("Es el médico especializado en el estudio de las vías urinarias, ofrece tratamiento, prevención y diagnóstico a pacientes de todas las edades. Enfermedades que trata: infección de vías urinarias y enfermedades de transmisión sexual.");
		 }
		 
		 
		 
		 
		    adapter = new adapterdirectorio(ListaMedicosActivity.this, R.id.listView2,
					fetch);
			ListViewopction.setAdapter(adapter);
		 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lista_medicos, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
