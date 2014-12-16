package com.midoctor.proyectdoc1;

import java.util.ArrayList;

import com.midoctor.proyectdoc1.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;
public class adapterdirectorio extends ArrayAdapter<classespecialidades> {
	private ArrayList<classespecialidades> entries;
	private Activity activity;

	public adapterdirectorio(Activity a, int textViewResourceId,
			ArrayList<classespecialidades> entries) {
		super(a, textViewResourceId, entries);
		this.entries = entries;
		this.activity = a;
		
	}

	public static class ViewHolder {
		public TextView item1;
		public TextView item2;
		public ImageButton btnEdit;
		public ImageButton btntel;
		public ImageButton btnemail;
		public ImageView btnimage;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;
		ViewHolder holder;
		if (v == null) {
			LayoutInflater vi = (LayoutInflater) activity
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = vi.inflate(R.layout.listdirectorio, null);
			holder = new ViewHolder();
			holder.item1 = (TextView) v.findViewById(R.id.LblTitulo);
			holder.item2 = (TextView) v.findViewById(R.id.Lbldetail);
		   holder.btnEdit = (ImageButton) v.findViewById(R.id.bottonubicacion);
		   holder.btntel = (ImageButton) v.findViewById(R.id.bottontel);
		   holder.btnemail= (ImageButton) v.findViewById(R.id.bottonemail);
		   holder.btnimage= (ImageView) v.findViewById(R.id.thumbtel);
		   
		   
			v.setTag(holder);
		} else
			holder = (ViewHolder) v.getTag();

		final classespecialidades so = entries.get(position);
		if (so != null) {
			holder.item1.setText(so.Name());
			holder.item2.setText(so.Detalle());
			
			
			if(so.Detalle().equals("Especialista Pediátrica"))
			{
				holder.btnimage.setImageResource(R.drawable.eunicemay);
			}
			if(so.Detalle().equals("Pediatra"))
			{
				holder.btnimage.setImageResource(R.drawable.pediatra1);
			}
			if(so.Detalle().equals("Especialistadad en Odontopeditría"))
			{
				holder.btnimage.setImageResource(R.drawable.odontopediatra1);
			}
			if(so.Detalle().equals("Reomatologia Pediátrica"))
			{
				holder.btnimage.setImageResource(R.drawable.reumatologia1);
			}
			
			if(so.Detalle().equals("Medico Pediátra alergólogo") && so.getId().equals("5"))
			{
				holder.btnimage.setImageResource(R.drawable.logodrfrancisco31);
			}
			
			if(so.Detalle().equals("Medico Pediátra alergólogo") && !so.getId().equals("5"))
			{
				holder.btnimage.setImageResource(R.drawable.pediatra1);
			}
			if(so.Detalle().equals("Pediátrica Neonatólogo")|| so.Detalle().equals("Neonatóloga"))
			{
				holder.btnimage.setImageResource(R.drawable.pediatra1); 
			}
			
			if(!so.Detalle().equals("Reomatologia Pediátrica") && !so.Detalle().equals("Especialistadad en Odontopeditría")
					&& !so.Detalle().equals("Pediatra") && !so.Detalle().equals("Especialista Pediátrica")
					&& !so.Detalle().equals("Pediátrica Neonatólogo") && !so.Detalle().equals("Neonatóloga")
					&& !so.Detalle().equals("Medico Pediátra alergólogo")
				    && !so.Detalle().equals("Medico Pediátra alergólogo")
				    && !so.getId().equals("5")
					)
			{
				holder.btnimage.setImageResource(R.drawable.pediatra1);
			}
			
		
		}
		

		holder.item1.setOnClickListener(new OnClickListener() {

			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub
			    
				  
		        	Intent visitas = new Intent(v.getContext(), fichadoctor.class);
		        	visitas.putExtra("id", so.getId());
		        	visitas.putExtra("Nombre", so.Name());
		        	visitas.putExtra("especialidad", so.Detalle());
		        	visitas.putExtra("direccion", so.Direccion());
		        	visitas.putExtra("correo", so.correo());
		        	visitas.putExtra("telefono", so.telefono());
		        	activity.startActivity(visitas);
		        	((Activity)v.getContext()).finish();
				   
			   }
			  });
		
		holder.item2.setOnClickListener(new OnClickListener() {

			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub
			    
				  
		        	Intent visitas = new Intent(v.getContext(), fichadoctor.class);
		        	visitas.putExtra("id", so.getId());
		        	visitas.putExtra("Nombre", so.Name());
		        	visitas.putExtra("especialidad", so.Detalle());
		        	visitas.putExtra("direccion", so.Direccion());
		        	visitas.putExtra("correo", so.correo());
		        	visitas.putExtra("telefono", so.telefono());
		        	activity.startActivity(visitas);
		        	((Activity)v.getContext()).finish();
				   
			   }
			  });
		
		holder.btnimage.setOnClickListener(new OnClickListener() {

			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub
			    
				  
		        	Intent visitas = new Intent(v.getContext(), fichadoctor.class);
		        	visitas.putExtra("id", so.getId());
		        	visitas.putExtra("Nombre", so.Name());
		        	visitas.putExtra("especialidad", so.Detalle());
		        	visitas.putExtra("direccion", so.Direccion());
		        	visitas.putExtra("correo", so.correo());
		        	visitas.putExtra("telefono", so.telefono());
		        	activity.startActivity(visitas);
		        	((Activity)v.getContext()).finish();
				   
			   }
			  });
		
		holder.btntel.setOnClickListener(new OnClickListener() {

			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub
			    
				   Log.i("Edit Button Clicked", "xxxxxxxxxxxxxxxxx");
				   Intent intent = new Intent(Intent.ACTION_DIAL);
					intent.setData(Uri.parse("tel:" + so.telefono()));
					activity.startActivity(intent);
			   }
			  });
		
		holder.btnemail.setOnClickListener(new OnClickListener() {

			   @Override
			   public void onClick(View v) {
			    // TODO Auto-generated method stub
				   String to = so.correo() ;
					  String subject = "";
					  String message ="";
					  Intent email = new Intent(Intent.ACTION_SEND);
					  email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
					  //email.putExtra(Intent.EXTRA_CC, new String[]{ to});
					  //email.putExtra(Intent.EXTRA_BCC, new String[]{to});
					  email.putExtra(Intent.EXTRA_SUBJECT, subject);
					  email.putExtra(Intent.EXTRA_TEXT, message);

					  //need this to prompts email client only
					  email.setType("message/rfc822");

					  activity.startActivity(Intent.createChooser(email, "Seleccione un correo:"));
				  
			   }
			  });
		
		holder.btnEdit.setOnClickListener(new OnClickListener() {

			   @Override
			   public void onClick(View v) {
				   
				   Intent map = new Intent(v.getContext(), mapActivity.class);
				   map.putExtra("code", so.Code());
				   map.putExtra("nombre", so.Name());
				   map.putExtra("coordenadasla", so.Coordenadasla());
				   map.putExtra("coordenadaslo", so.Coordenadaslo());
				   map.putExtra("direccion", so.Direccion());
		        	activity.startActivity(map);
		        	
		        	((Activity)v.getContext()).finish();
				 
				
			   }
			  });
		
		
		
		
		 
		
		return v;
	}

}