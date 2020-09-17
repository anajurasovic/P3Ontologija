package ffos.ontologija.jurasovic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterListe extends RecyclerView.Adapter<AdapterListe.Red> {

    private List<Nominacije> podaci;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    public AdapterListe(Context context) {
        this.mInflater = LayoutInflater.from(context);
        podaci = new ArrayList<>();
    }

    @Override
    public Red onCreateViewHolder(ViewGroup roditelj, int viewType) {
        View view = mInflater.inflate(R.layout.red_liste, roditelj, false);
        return new Red(view);
    }

    @Override
    public void onBindViewHolder(Red red, int position) {
        Nominacije f = podaci.get(position);
        red.glumac.setText(f.getGlumac());
        red.film.setText(f.getFilm());
        red.nagrada.setText(f.getNagrada());;
        red.mjesto.setText(f.getMjesto());
        red.godina.setText(f.getGodina());
        red.dobioNagradu.setText(f.getDobioNagradu());
    }

    @Override
    public int getItemCount() {
        return podaci==null ? 0 : podaci.size();
    }

    public class Red extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView glumac;
        private TextView film;
        private TextView nagrada;
        private TextView mjesto;
        private TextView godina;
        private TextView dobioNagradu;

        Red(View itemView) {
            super(itemView);
            glumac = itemView.findViewById(R.id.glumac);
            film = itemView.findViewById(R.id.film);
            mjesto = itemView.findViewById(R.id.mjesto);
            nagrada = itemView.findViewById(R.id.nagrada);
            godina = itemView.findViewById(R.id.godina);
            dobioNagradu = itemView.findViewById(R.id.dobioNagradu);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    public Nominacije getItem(int id) {
        return podaci.get(id);
    }

    public void setPodaci(List<Nominacije> itemList) {
        this.podaci = itemList;
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
