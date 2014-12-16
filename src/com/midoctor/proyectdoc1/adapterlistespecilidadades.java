package com.midoctor.proyectdoc1;

import java.util.ArrayList;

import com.midoctor.proyectdoc1.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class adapterlistespecilidadades  extends ArrayAdapter<classespecialidades> {
	private ArrayList<classespecialidades> entries;
	private Activity activity;

	public adapterlistespecilidadades(Activity a, int textViewResourceId,
			ArrayList<classespecialidades> entries) {
		super(a, textViewResourceId, entries);
		this.entries = entries;
		this.activity = a;
	}

	public static class ViewHolder {
		public TextView item1;
		
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;
		ViewHolder holder;
		if (v == null) {
			LayoutInflater vi = (LayoutInflater) activity
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = vi.inflate(R.layout.list_especialidades, null);
			holder = new ViewHolder();
			holder.item1 = (TextView) v.findViewById(R.id.Lblespecialidades);
			
			v.setTag(holder);
		} else
			holder = (ViewHolder) v.getTag();

		final classespecialidades so = entries.get(position);
		if (so != null) {
			holder.item1.setText(so.Name());
			
		}
		return v;
	}

}