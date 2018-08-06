package musicplayer.flora.android.application.desichoice;

import android.content.Context;

import java.util.ArrayList;
import java.util.HashMap;

public class SongsManager  {
	// SDCard Path
	//final String MEDIA_PATH = new String("/sdcard/");
	private ArrayList<HashMap<String, String>> songsList = new ArrayList<HashMap<String, String>>();
    Context context ;
	// Constructor
	public SongsManager() {

	}

	/**
	 * Function to read all mp3 files from sdcard
	 * and store the details in ArrayList
	 */
	/*public ArrayList<HashMap<String, String>> getPlayList(){
		File home = new File(MEDIA_PATH);

		if (home.listFiles(new FileExtensionFilter()).length > 0) {
			for (File file : home.listFiles(new FileExtensionFilter())) {
				HashMap<String, String> song = new HashMap<String, String>();
				song.put("songTitle", file.getName().substring(0, (file.getName().length() - 4)));
				song.put("songPath", file.getPath());
				
				// Adding each song to SongList
				songsList.add(song);
			}
		}
		// return songs list array
		return songsList;
	}
	
	/**
	 * Class to filter files which are having .mp3 extension
	 * */
	/*class FileExtensionFilter implements FilenameFilter {
		public boolean accept(File dir, String name) {
			return (name.endsWith(".mp3") || name.endsWith(".MP3"));
		}
	}*/
	public ArrayList<HashMap<String, String>> getPlayList() {

        HashMap<String, String> song46 = new HashMap<String, String>();
        song46.put("songTitle", "Lat lag gayi");
        song46.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eTXFLMXpEcnhicjA");
        songsList.add(song46);
        //https://drive.google.com/file/d/0B2-79bnkrLxEVEFVNWRTdzFRYVU/view?usp=sharing
        HashMap<String, String> song16 = new HashMap<String, String>();
        song16.put("songTitle", "Mujhe teri");
        song16.put("songPath", "http://docs.google.com/uc?export=download&id=1xIVr-jH6bZ0KSzH5CGn3nOzNDs57LeuA");
        songsList.add(song16);

        HashMap<String, String> song52= new HashMap<String, String>();
        song52.put("songTitle", "Tere mast mast do");
        song52.put("songPath", "http://docs.google.com/uc?export=download&id=1x8e_GXNTJDIbmq0sNgFXsPwAQQg3mhGT");
        songsList.add(song52);

		HashMap<String, String> song2 = new HashMap<String, String>();
		song2.put("songTitle", "Chori kiya re jiya");
		song2.put("songPath", "http://docs.google.com/uc?export=download&id=1ailLhrw44_7UIt4qEWYREGwT7k7woiQy");
		songsList.add(song2);

        HashMap<String, String> song3= new HashMap<String, String>();
        song3.put("songTitle", "Bekhabar");
        song3.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0ea3lFUDltUFFFS0k");
        songsList.add(song3);





		HashMap<String, String> song5 = new HashMap<String, String>();
		song5.put("songTitle", "Tum chain ho");
		song5.put("songPath", "http://docs.google.com/uc?export=download&id=10NLIzGwNdVZo1Mj5jMZXd9_l1pLrAvAh");
		songsList.add(song5);

       //https://drive.google.com/file/d/0B2-79bnkrLxEaE95bUs2X2Z4ZUE/view?usp=sharing
		HashMap<String, String> song6 = new HashMap<String, String>();
		song6.put("songTitle", "Kuch to baki hai");
		song6.put("songPath", "http://docs.google.com/uc?export=download&id=1UJEXXAAtoHw-RnH97uto1m0F9-UYbQGX");
		songsList.add(song6);
		//https://drive.google.com/file/d/0B2-79bnkrLxENU1Zb0dReko2MXM/view?usp=sharing

        HashMap<String, String> song7 = new HashMap<String, String>();
		song7.put("songTitle", "Sajde kiye hai ");
		song7.put("songPath", "http://docs.google.com/uc?export=download&id=16XB3lJbxH-TPzieYwDftm1_xexs8B-TN");
		songsList.add(song7);
		//https://drive.google.com/file/d/0B2-79bnkrLxET3dVelpMbEtrVjQ/view?usp=sharing

        HashMap<String, String> song8 = new HashMap<String, String>();
		song8.put("songTitle", "Gum sum gum sum");
		song8.put("songPath", "http://docs.google.com/uc?export=download&id=1bz9GLtDHWuEaTq2sEBQw2Q9mTqkclN5M");
		songsList.add(song8);
		//https://drive.google.com/file/d/0B2-79bnkrLxEek5NNmtpaUJBeU0/view?usp=sharing
		HashMap<String, String> song9 = new HashMap<String, String>();
		song9.put("songTitle", "Ranjha ranjha");
		song9.put("songPath", "http://docs.google.com/uc?export=download&id=1fZ1Ga5hL0_u_gxKR5lhCq6BAFe9zagNR");
		songsList.add(song9);
		//https://drive.google.com/file/d/0B2-79bnkrLxEMGVPY2x6UnhHb28/view?usp=sharing

        HashMap<String, String> song10= new HashMap<String, String>();
        song10.put("songTitle", "Mohe rang do laal");
        song10.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eVGNJSGwtdzU4Z00");
        songsList.add(song10);


        //https://drive.google.com/file/d/0B2-79bnkrLxERnNvZkNKWXdQNzQ/view?usp=sharing
		HashMap<String, String> song11 = new HashMap<String, String>();
		song11.put("songTitle", "Hai kya ye");
		song11.put("songPath", "http://docs.google.com/uc?export=download&id=1VbG9Y8dFfD-Qy64AHloYPKtORs5cTBZd");
		songsList.add(song11);
        //https://drive.google.com/file/d/0B2-79bnkrLxERkJwcTR2bkRJcWs/view?usp=sharing

		HashMap<String, String> song12 = new HashMap<String, String>();
		song12.put("songTitle", "Bahara bahara");
		song12.put("songPath", "http://docs.google.com/uc?export=download&id=1Nqgpea-KBtjqo5JFe0WBKdDsbeT5vz0Q");
		songsList.add(song12);
       //https://drive.google.com/file/d/0B2-79bnkrLxENUhFbGtDM080OW8/view?usp=sharing

        HashMap<String, String> song13 = new HashMap<String, String>();

        song13.put("songTitle", "Sadka kiya ");
        song13.put("songPath", "http://docs.google.com/uc?export=download&id=1LE1BW7sk_q08ywZzzxzT0p8cYsbvRMln");
        songsList.add(song13);
		//https://drive.google.com/file/d/0B2-79bnkrLxEUGk3NDIwVmdCQkE/view?usp=sharing

		HashMap<String, String> song14 = new HashMap<String, String>();
		song14.put("songTitle", "Bewafa");
		song14.put("songPath", "http://docs.google.com/uc?export=download&id=1zJBlURfb4btV3Rhqw643NhGB1sqZgReQ");
		songsList.add(song14);

        //https://drive.google.com/file/d/0B2-79bnkrLxEYklKYnFlZEVUQkU/view?usp=sharing
		HashMap<String, String> song15 = new HashMap<String, String>();
		song15.put("songTitle", "Shor kare ");
		song15.put("songPath", "http://docs.google.com/uc?export=download&id=1fcJURePiyC9iOLesSzeLznSO4REu");
		songsList.add(song15);




        // https://drive.google.com/file/d/0B2-79bnkrLxEQkJFTWxuU0EzMFk/view?usp=sharing
		HashMap<String, String> song17 = new HashMap<String, String>();
		song17.put("songTitle", "Bekarar hai ");
		song17.put("songPath", "http://docs.google.com/uc?export=download&id=1tNWJUwgZxeQzzENfXLugYcQWyPvn2C9Z");
		songsList.add(song17);

//change
		HashMap<String, String> song18 = new HashMap<String, String>();
		song18.put("songTitle", "Teri marzi");
		song18.put("songPath", "http://docs.google.com/uc?export=download&id=1Rypo6Wojc4DWjRmIHq_ELSL4wEJK9Xsx");
		songsList.add(song18);

	   //https://drive.google.com/file/d/0B2-79bnkrLxEc1pZQktJaUo4bWs/view?usp=sharing

		HashMap<String, String> song19 = new HashMap<String, String>();
		song19.put("songTitle", "Tere liye ");
		song19.put("songPath", "http://docs.google.com/uc?export=download&id=1mIce7HSO5JdSoM2JEG6S61vYbmsRdXFr");
		songsList.add(song19);


       //https://drive.google.com/file/d/0B2-79bnkrLxEZXg1QkRYeTdQY1E/view?usp=sharing
		HashMap<String, String> song20 = new HashMap<String, String>();
		song20.put("songTitle", "Aa bhi ja sanam");
		song20.put("songPath", "http://docs.google.com/uc?export=download&id=1kKgn_mrPWXtT6S5WIzuov_ZzWP3ogpUH");
		songsList.add(song20);

       //https://drive.google.com/file/d/0B2-79bnkrLxEbWFRNVJTQzA3ZW8/view?usp=sharing

        HashMap<String, String> song21= new HashMap<String, String>();
        song21.put("songTitle", "Kissa tera teri");
        song21.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eYVRsMjhhbWJhMDg");
        songsList.add(song21);
	  //https://drive.google.com/file/d/0B2-79bnkrLxEOGoyR1FZcU9Dazg/view?usp=sharing

//change
        HashMap<String, String> song22 = new HashMap<String, String>();
		song22.put("songTitle", "Naina laage");
		song22.put("songPath", "http://docs.google.com/uc?export=download&id=1mZUYp9b6JwIi5plO4sbIXQ2YjupzsS4T");
		songsList.add(song22);

      //https://drive.google.com/file/d/0B2-79bnkrLxEbFBnNTlFQWhhMTA/view?usp=sharing
		HashMap<String, String> song23 = new HashMap<String, String>();
		song23.put("songTitle", "Falsafa ye zindagi ka");
		song23.put("songPath", "http://docs.google.com/uc?export=download&id=1pQZIe5QWyJ_G5nBUQ-1Dt52uqSdilkgh");
		songsList.add(song23);

      //https://drive.google.com/file/d/0B2-79bnkrLxEVG1HT2c4dE1oVm8/view?usp=sharing

        HashMap<String, String> song24 = new HashMap<String, String>();
        song24.put("songTitle", "Kal tum the");
        song24.put("songPath", "http://docs.google.com/uc?export=download&id=1YuoPtPI2vtGW8B096ZCXiKMxB-_VcPGC");
        songsList.add(song24);

        HashMap<String, String> song25 = new HashMap<String, String>();
        song25.put("songTitle", "Dekho raste mai");
        song25.put("songPath", "http://docs.google.com/uc?export=download&id=EpKlNabO7j6ETPyi1uKStT0axfH7");
        songsList.add(song25);


        HashMap<String, String> song26 = new HashMap<String, String>();
        song26.put("songTitle", "Tere naina ");
        song26.put("songPath", "http://docs.google.com/uc?export=download&id=11BESmNrtvr2uU5zrsUmQuPyO-V1ZV5hL");
        songsList.add(song26);

        HashMap<String, String> song27 = new HashMap<String, String>();
        song27.put("songTitle", "Sajda");
        song27.put("songPath", "http://docs.google.com/uc?export=download&id=1twix_duNNG42BeUtLYIzJx4yOxcdZyF5");
        songsList.add(song27);


        HashMap<String, String> song28 = new HashMap<String, String>();
        song28.put("songTitle", "Baccha hai ji");
        song28.put("songPath", "http://docs.google.com/uc?export=download&id=1mIAy7ns2ix8tSskJ0H42d670l5crWAn8");
        songsList.add(song28);


        HashMap<String, String> song29 = new HashMap<String, String>();
        song29.put("songTitle", "Surili ankhiyo wale");
        song29.put("songPath", "http://docs.google.com/uc?export=download&id=13WD7MbVuwfr2_Wt2PPgD6GaRQF0QszCs");
        songsList.add(song29);

        HashMap<String, String> song30 = new HashMap<String, String>();
        song30.put("songTitle", "Salaam aaya");
        song30.put("songPath", "http://docs.google.com/uc?export=download&id=1miw_JZ93O9k2zWKQfbNVfNsJEdFaxsSH");
        songsList.add(song30);


        HashMap<String, String> song31 = new HashMap<String, String>();
        song31.put("songTitle", "Zubi doobi");
        song31.put("songPath", "http://docs.google.com/uc?export=download&id=1WCaPIeryNfwL9kwMvodtu2hK_-C-k5o3");
        songsList.add(song31);

        HashMap<String, String> song32 = new HashMap<String, String>();
        song32.put("songTitle", "Give me");
        song32.put("songPath", "http://docs.google.com/uc?export=download&id=1obGCUe-GLHXVXWo5xsY443ZrqzgmkPaw");
        songsList.add(song32);

        HashMap<String, String> song33 = new HashMap<String, String>();
        song33.put("songTitle", "Behti hawa sa");
        song33.put("songPath", "http://docs.google.com/uc?export=download&id=1ECAP5ccBR2UVLddJ1uqiIprHYCV5f71q");
        songsList.add(song33);


        HashMap<String, String> song34 = new HashMap<String, String>();
        song34.put("songTitle", "Sajna sajnaa");
        song34.put("songPath", "http://docs.google.com/uc?export=download&id=1gLr5Pwv6Tre92CMxRebSySjGD5gxDdfP");
        songsList.add(song34);


        HashMap<String, String> song35 = new HashMap<String, String>();
        song35.put("songTitle", "Tu jaane na");
        song35.put("songPath", "http://docs.google.com/uc?export=download&id=1pqGYFjAVBQ8vGwDRatpztFerA8BYZYZ");
        songsList.add(song35);


        HashMap<String, String> song36 = new HashMap<String, String>();
        song36.put("songTitle", "Tera hone laga hu");
        song36.put("songPath", "http://docs.google.com/uc?export=download&id=1E9AFm_ZDvgyzWxS3LzlwB2d5fkoGOeed");
        songsList.add(song36);

        HashMap<String, String> song37 = new HashMap<String, String>();
        song37.put("songTitle", "Gale lag ja");
        song37.put("songPath", "http://docs.google.com/uc?export=download&id=1_mKlBF0j815rbC4zy-ydztq62kwPbfcx");
        songsList.add(song37);

        HashMap<String, String> song38 = new HashMap<String, String>();
        song38.put("songTitle", "Gum sum gum");
        song38.put("songPath", "http://docs.google.com/uc?export=download&id=1BR7Z8aP3MeVFPkjis1Oz5Kf5SH6sNYBb");
        songsList.add(song38);

        HashMap<String, String> song39 = new HashMap<String, String>();
        song39.put("songTitle", "Chahta tumko");
        song39.put("songPath", "http://docs.google.com/uc?export=download&id=18GJqobsiWaH5eoCowVfmncP3_zYS7usB");
        songsList.add(song39);


        HashMap<String, String> song40 = new HashMap<String, String>();
        song40.put("songTitle", "Teri ankho se");
        song40.put("songPath", "http://docs.google.com/uc?export=download&id=1YLToVdtR6jIxMZe_JntlSpj8nhdBy-Wi");
        songsList.add(song40);


        HashMap<String, String> song41 = new HashMap<String, String>();
        song41.put("songTitle", "Lagta nahi");
        song41.put("songPath", "http://docs.google.com/uc?export=download&id=1G8iik8m6ipek-3GANZlyObaGcz-gqRzJ");
        songsList.add(song41);


        HashMap<String, String> song42 = new HashMap<String, String>();
        song42.put("songTitle", "Ankhe tumhari");
        song42.put("songPath", "http://docs.google.com/uc?export=download&id=1i3eQfFnJbKxSWZ-x3UZ_T6mbIXnrQCTt");
        songsList.add(song42);



        HashMap<String, String> song43 = new HashMap<String, String>();
        song43.put("songTitle", "Kaisa hai ye");
        song43.put("songPath", "http://docs.google.com/uc?export=download&id=1EcmWRRnkKyY_fjn_uGr3uX09HZcSBXRq");
        songsList.add(song43);

        HashMap<String, String> song44 = new HashMap<String, String>();
        song44.put("songTitle", "Mujhe teri");
        song44.put("songPath", "http://docs.google.com/uc?export=download&id=1lmW04oTOz_7vaI4Y9N7FHrzwA4Ah1qFl");
        songsList.add(song44);


        HashMap<String, String> song45 = new HashMap<String, String>();
        song45.put("songTitle", "Rah jaane do ");
        song45.put("songPath", "http://docs.google.com/uc?export=download&id=1Nlv0xQ3azuNMEdN-LVwObKcmI-nI7mnr");
        songsList.add(song45);





        HashMap<String, String> song47 = new HashMap<String, String>();
        song47.put("songTitle", "Laung gawacha");
        song47.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eUm4tWXI2TXQwYnM");
        songsList.add(song47);


        HashMap<String, String> song48 = new HashMap<String, String>();
        song48.put("songTitle", "Kuch aisa ho jaaye");
        song48.put("songPath", "http://docs.google.com/uc?export=download&id=1qUSmKpkp9r1WTLfL1lKVetmTorl2d6l_");
        songsList.add(song48);

        HashMap<String, String> song49 = new HashMap<String, String>();
        song49.put("songTitle", "Love me thora aur");
        song49.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eamp6ZzRuMzExVWM");
        songsList.add(song49);


        HashMap<String, String> song50= new HashMap<String, String>();
        song50.put("songTitle", "Kaare kaare");
        song50.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eY0ZKdUZ2UEdhbjg");
        songsList.add(song50);

        HashMap<String, String> song51 = new HashMap<String, String>();
        song51.put("songTitle", "Tere bina");
        song51.put("songPath", "http://docs.google.com/uc?export=download&id=1tCu0fo0urogPrTw531QQs5FanYs2ftED");
        songsList.add(song51);




        HashMap<String, String> song1 = new HashMap<String, String>();
        song1.put("songTitle", "Tum hi to ho");
        song1.put("songPath", "http://docs.google.com/uc?export=download&id=1nxw4irHlFQwmgFXacBaSgVzMV361supJ");
        songsList.add(song1);


        HashMap<String, String> song53 = new HashMap<String, String>();
        song53.put("songTitle", "Phir se");
        song53.put("songPath", "http://docs.google.com/uc?export=download&id=1ygi_3cRbEkdOjQiHjjKUWqtk8O85UZV2");
        songsList.add(song53);


        HashMap<String, String> song54 = new HashMap<String, String>();
        song54.put("songTitle", "Karle mujhse pyar");
        song54.put("songPath", "http://docs.google.com/uc?export=download&id=1cXYNp5bijGdag-fs9Jg51Um20ynqvkvT");
        songsList.add(song54);


        HashMap<String, String> song55 = new HashMap<String, String>();
        song55.put("songTitle", "Nashe si chad gayi");
        song55.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eWW0yQnYtX21fZWs");
        songsList.add(song55);

        HashMap<String, String> song56 = new HashMap<String, String>();
        song56.put("songTitle", "Tenu le ke mai");
        song56.put("songPath", "http://docs.google.com/uc?export=download&id=16u7VtYpd1OYnm2htUZYPbY6aMehre6P9");
        songsList.add(song56);


        HashMap<String, String> song57 = new HashMap<String, String>();
        song57.put("songTitle", "Tere bina");
        song57.put("songPath", "http://docs.google.com/uc?export=download&id=1RJbHkrriELGuvFaVVnJ5mdk_nyp3sqIV");
        songsList.add(song57);


        HashMap<String, String> song58 = new HashMap<String, String>();
        song58.put("songTitle", "Ye dooriya");
        song58.put("songPath", "http://docs.google.com/uc?export=download&id=1hQ684i_elc6UPWbVA0aePMUPMEniIfYz");
        songsList.add(song58);


        HashMap<String, String> song59 = new HashMap<String, String>();
        song59.put("songTitle", "Aaj dn chadhiya");
        song59.put("songPath", "http://docs.google.com/uc?export=download&id=1_5zkNlIZy8jv4AKF415oMAEYRAv3kCtZ");
        songsList.add(song59);

        HashMap<String, String> song60 = new HashMap<String, String>();
        song60.put("songTitle", "Ab tere bin hum");
        song60.put("songPath", "http://docs.google.com/uc?export=download&id=1zzb079Kc8kn9UyYAnQ_xZ7jxduUX5iaQ");
        songsList.add(song60);

        HashMap<String, String> song61 = new HashMap<String, String>();
        song61.put("songTitle", "Kyuki tu");
        song61.put("songPath", "http://docs.google.com/uc?export=download&id=1_M-nEr8WGxsdLvPipOuXjYT45PUzmkCZ");
        songsList.add(song61);

        HashMap<String, String> song62 = new HashMap<String, String>();
        song62.put("songTitle", "Cham cham jaani");
        song62.put("songPath", "http://docs.google.com/uc?export=download&id=14T_xxHBaGKuE1jpfVr6bqXbAfZn1hUKp");
        songsList.add(song62);


        HashMap<String, String> song63 = new HashMap<String, String>();
        song63.put("songTitle", "Pyar kiya ");
        song63.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eemFJZ1BpY3VQSkk");
        songsList.add(song63);


        HashMap<String, String> song64 = new HashMap<String, String>();
        song64.put("songTitle", "Raabta");
        song64.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0ecE9mcllNMGdVSHc");
        songsList.add(song64);



        HashMap<String, String> song65 = new HashMap<String, String>();
        song65.put("songTitle", "Kabhi na kabhi to");
        song65.put("songPath", "http://docs.google.com/uc?export=download&id=11lXXLLKPRXZ-vlwTygtFsMG43O7FhrN3");
        songsList.add(song65);

        HashMap<String, String> song66 = new HashMap<String, String>();
        song66.put("songTitle", "Raat bhar");
        song66.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eYkNNelVfVTduUW8");
        songsList.add(song66);

        HashMap<String, String> song67 = new HashMap<String, String>();
        song67.put("songTitle", "Teri yaad aayi");
        song67.put("songPath", "http://docs.google.com/uc?export=download&id=1ZwZl6nl_VyTOZXkvT1lEiA2xEY60nF6g");
        songsList.add(song67);

        HashMap<String, String> song68 = new HashMap<String, String>();
        song68.put("songTitle", "Rehna tu");
        song68.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eUUpMQW9SQm5LM1E");
        songsList.add(song68);


        HashMap<String, String> song69 = new HashMap<String, String>();
        song69.put("songTitle", "Sab tera");
        song69.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eUm13NDBCbGVlUVk");
        songsList.add(song69);


        HashMap<String, String> song70 = new HashMap<String, String>();
        song70.put("songTitle", "Suno tum zara");
        song70.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eYVYwWFljTVRhbHM");
        songsList.add(song70);


        HashMap<String, String> song71 = new HashMap<String, String>();
        song71.put("songTitle", "Shukra tera ");
        song71.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eSmFnRzFIa0tUT0k");
        songsList.add(song71);


        HashMap<String, String> song72 = new HashMap<String, String>();
        song72.put("songTitle", "Sun le zara");
        song72.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eMm1DZUFUaTkyWHM");
        songsList.add(song72);

        HashMap<String, String> song73 = new HashMap<String, String>();
        song73.put("songTitle", "Sun sathiya");
        song73.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0ecmF5YU9IS2duZHc");
        songsList.add(song73);

        HashMap<String, String> song74 = new HashMap<String, String>();
        song74.put("songTitle", "Ae mohobaat tere");
        song74.put("songPath", "http://docs.google.com/uc?export=download&id=1yuSqQHyaChoHThEvMOFLr8YM4R5mSYQJ");
        songsList.add(song74);


        HashMap<String, String> song75 = new HashMap<String, String>();
        song75.put("songTitle", "Piya ghar aaye");
        song75.put("songPath", "http://docs.google.com/uc?export=download&id=18YgloeIQ6_QxzMEWqzMvwQ8cUuHp9krz");
        songsList.add(song75);


        HashMap<String, String> song76 = new HashMap<String, String>();
        song76.put("songTitle", "Ab mujhe koi");
        song76.put("songPath", "http://docs.google.com/uc?export=download&id=1eHuca090HF02p37uh7Nsf7xJFPEyYQaG");
        songsList.add(song76);


        HashMap<String, String> song77 = new HashMap<String, String>();
        song77.put("songTitle", "Accha chalta hu");
        song77.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eMWhTS0VHSDMwajg");
        songsList.add(song77);

        HashMap<String, String> song78 = new HashMap<String, String>();
        song78.put("songTitle", "Tera hoke rahunga");
        song78.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eOUhFbFhqNENodWs");
        songsList.add(song78);

        HashMap<String, String> song79 = new HashMap<String, String>();
        song79.put("songTitle", "Tera hone");
        song79.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0ebWVJZGJkZzV6UlE");
        songsList.add(song79);

        HashMap<String, String> song80 = new HashMap<String, String>();
        song80.put("songTitle", "Tere ishq me");
        song80.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eaEx3TGFFeUZvWTg");
        songsList.add(song80);


        HashMap<String, String> song81 = new HashMap<String, String>();
        song81.put("songTitle", "Bhor bhaye");
        song81.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eb1QzZUhmUTVrMmM");
        songsList.add(song81);


        HashMap<String, String> song82 = new HashMap<String, String>();
        song82.put("songTitle", "Tu har lamha");
        song82.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eT3hrS1p1ZWU3eWM");
        songsList.add(song82);


        HashMap<String, String> song83 = new HashMap<String, String>();
        song83.put("songTitle", "Tu hi hai aashiqui");
        song83.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eRkk3MHRobXhvdDA");
        songsList.add(song83);

        HashMap<String, String> song84 = new HashMap<String, String>();
        song84.put("songTitle", "Maine chun liye");
        song84.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eRm9WeVlMdm1XN0k");
        songsList.add(song84);
//https://drive.google.com/file/d/0BzAu3fklhG0eZ05UU1BFNHo3Wjg/view?usp=sharing
        HashMap<String, String> song85 = new HashMap<String, String>();
        song85.put("songTitle", "Tu jo mila");
        song85.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eZ05UU1BFNHo3Wjg");
        songsList.add(song85);

        HashMap<String, String> song86= new HashMap<String, String>();
        song86.put("songTitle", "Tear deedar");
        song86.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eSkhDZ2xSWXlHY28");
        songsList.add(song86);

        HashMap<String, String> song87 = new HashMap<String, String>();
        song87.put("songTitle", "Tum saath ho");
        song87.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eTXNBNzBKNXJRNkk");
        songsList.add(song87);


        HashMap<String, String> song88 = new HashMap<String, String>();
        song88.put("songTitle", "Wo subah");
        song88.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eNk1CQ3FzcUxZSnM");
        songsList.add(song88);


        HashMap<String, String> song89= new HashMap<String, String>();
        song89.put("songTitle", "Yaad hai na");
        song89.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0ebUZaWjBXYVdsRmc");
        songsList.add(song89);

        HashMap<String, String> song90= new HashMap<String, String>();
        song90.put("songTitle", "Rehna tu");
        song90.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eUUpMQW9SQm5LM1E");
        songsList.add(song90);


        HashMap<String, String> song91= new HashMap<String, String>();
        song91.put("songTitle", "Kissa tera teri");
        song91.put("songPath", "http://docs.google.com/uc?export=download&id=0BzAu3fklhG0eYVRsMjhhbWJhMDg");
        songsList.add(song91);













      /*

     */

		// return songs list array
		return songsList;
	}
}