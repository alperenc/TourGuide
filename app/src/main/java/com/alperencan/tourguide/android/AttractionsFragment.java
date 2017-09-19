package com.alperencan.tourguide.android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class AttractionsFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public AttractionsFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static AttractionsFragment newInstance(int sectionNumber) {
        AttractionsFragment fragment = new AttractionsFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        AttractionAdapter adapter = null;

        switch (getArguments().getInt(ARG_SECTION_NUMBER)) {
            case 1:
                // Create a list of hotel attractions
                final ArrayList<Attraction> hotelAttractions = new ArrayList<Attraction>();
                hotelAttractions.add(new Attraction(R.string.hotel_title_barbera, R.string.hotel_address_barbera));
                hotelAttractions.add(new Attraction(R.string.hotel_title_white_house, R.string.hotel_address_white_house));
                hotelAttractions.add(new Attraction(R.string.hotel_title_amira, R.string.hotel_address_amira));
                hotelAttractions.add(new Attraction(R.string.hotel_title_sirkeci_mansion, R.string.hotel_address_sirkeci_mansion));
                hotelAttractions.add(new Attraction(R.string.hotel_title_osmanhan, R.string.hotel_address_osmanhan));
                hotelAttractions.add(new Attraction(R.string.hotel_title_raffles, R.string.hotel_address_raffles));
                hotelAttractions.add(new Attraction(R.string.hotel_title_tomtom, R.string.hotel_address_tomtom));
                hotelAttractions.add(new Attraction(R.string.hotel_title_park_hyatt, R.string.hotel_address_park_hyatt));
                hotelAttractions.add(new Attraction(R.string.hotel_title_four_seasons, R.string.hotel_address_four_seasons));
                hotelAttractions.add(new Attraction(R.string.hotel_title_karakoy_port, R.string.hotel_address_karakoy_port));

                // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s.
                // The adapter knows how to create a list items for each item in the list.
                adapter = new AttractionAdapter(getActivity(), hotelAttractions, R.color.attraction_hotels);
                break;
            case 2:
                // Create a list of mall attractions
                final ArrayList<Attraction> mallAttractions = new ArrayList<Attraction>();
                mallAttractions.add(new Attraction(R.string.mall_title_istinye, R.string.mall_address_istinye));
                mallAttractions.add(new Attraction(R.string.mall_title_cevahir, R.string.mall_address_cevahir));
                mallAttractions.add(new Attraction(R.string.mall_title_zorlu, R.string.mall_address_zorlu));
                mallAttractions.add(new Attraction(R.string.mall_title_aqua_florya, R.string.mall_address_aqua_florya));
                mallAttractions.add(new Attraction(R.string.mall_title_kanyon, R.string.mall_address_kanyon));
                mallAttractions.add(new Attraction(R.string.mall_title_forum, R.string.mall_address_forum));
                mallAttractions.add(new Attraction(R.string.mall_title_istanbul, R.string.mall_address_istanbul));
                mallAttractions.add(new Attraction(R.string.mall_title_viaport, R.string.mall_address_viaport));
                mallAttractions.add(new Attraction(R.string.mall_title_akasya, R.string.mall_address_akasya));
                mallAttractions.add(new Attraction(R.string.mall_title_emaar, R.string.mall_address_emaar));


                // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s.
                // The adapter knows how to create a list items for each item in the list.
                adapter = new AttractionAdapter(getActivity(), mallAttractions, R.color.attraction_malls);
                break;
            case 3:
                // Create a list of restaurant attractions
                final ArrayList<Attraction> restaurantAttractions = new ArrayList<Attraction>();
                restaurantAttractions.add(new Attraction(R.string.restaurant_title_deraliye, R.string.restaurant_address_deraliye));
                restaurantAttractions.add(new Attraction(R.string.restaurant_title_nicole, R.string.restaurant_address_nicole));
                restaurantAttractions.add(new Attraction(R.string.restaurant_title_sans, R.string.restaurant_address_sans));
                restaurantAttractions.add(new Attraction(R.string.restaurant_title_beyti, R.string.restaurant_address_beyti));
                restaurantAttractions.add(new Attraction(R.string.restaurant_title_mikla, R.string.restaurant_address_mikla));
                restaurantAttractions.add(new Attraction(R.string.restaurant_title_topaz, R.string.restaurant_address_topaz));
                restaurantAttractions.add(new Attraction(R.string.restaurant_title_matbah, R.string.restaurant_address_matbah));
                restaurantAttractions.add(new Attraction(R.string.restaurant_title_1924, R.string.restaurant_address_1924));
                restaurantAttractions.add(new Attraction(R.string.restaurant_title_tugra, R.string.restaurant_address_tugra));
                restaurantAttractions.add(new Attraction(R.string.restaurant_title_asitane, R.string.restaurant_address_asitane));

                // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s.
                // The adapter knows how to create a list items for each item in the list.
                adapter = new AttractionAdapter(getActivity(), restaurantAttractions, R.color.attraction_restaurants);
                break;
            case 4:
                // Create a list of historical site attractions
                final ArrayList<Attraction> historicalSiteAttractions = new ArrayList<Attraction>();
                historicalSiteAttractions.add(new Attraction(R.string.historical_site_title_hagia_sophia, R.string.historical_site_address_hagia_sophia));
                historicalSiteAttractions.add(new Attraction(R.string.historical_site_title_basilica_cistern, R.string.historical_site_address_basilica_cistern));
                historicalSiteAttractions.add(new Attraction(R.string.historical_site_title_eyup_sultan, R.string.historical_site_address_eyup_sultan));
                historicalSiteAttractions.add(new Attraction(R.string.historical_site_title_kucuk_ayasofya, R.string.historical_site_address_kucuk_ayasofya));
                historicalSiteAttractions.add(new Attraction(R.string.historical_site_title_galata_tower, R.string.historical_site_address_galata_tower));
                historicalSiteAttractions.add(new Attraction(R.string.historical_site_title_rumeli_fortress, R.string.historical_site_address_rumeli_fortress));
                historicalSiteAttractions.add(new Attraction(R.string.historical_site_title_maidens_tower, R.string.historical_site_address_maidens_tower));
                historicalSiteAttractions.add(new Attraction(R.string.historical_site_title_beylerbeyi, R.string.historical_site_address_beylerbeyi));
                historicalSiteAttractions.add(new Attraction(R.string.historical_site_title_anadolu_kavagi, R.string.historical_site_address_anadolu_kavagi));
                historicalSiteAttractions.add(new Attraction(R.string.historical_site_title_valens_aqueduct, R.string.historical_site_address_valens_aqueduct));

                // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s.
                // The adapter knows how to create a list items for each item in the list.
                adapter = new AttractionAdapter(getActivity(), historicalSiteAttractions, R.color.attraction_historical_sites);
                break;
            default:
                break;
        }

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // attraction_list.xml layout file. */
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above (check if not null),
        // so that the {@link ListView} will display list items for each {@link Attraction} in the list.
        if (adapter != null) {
            listView.setAdapter(adapter);
        }

        return rootView;
    }
}
