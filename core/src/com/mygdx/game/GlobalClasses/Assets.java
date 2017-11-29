//https://github.com/tuskeb/mester
package com.mygdx.game.GlobalClasses;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGeneratorLoader;
import com.badlogic.gdx.graphics.g2d.freetype.FreetypeFontLoader;


public class Assets {
	// https://github.com/libgdx/libgdx/wiki/Managing-your-assets
	// http://www.jacobplaster.net/using-libgdx-asset-manager
	// https://www.youtube.com/watch?v=JXThbQir2gU
	// https://github.com/Matsemann/libgdx-loading-screen/blob/master/Main/src/com/matsemann/libgdxloadingscreen/screen/LoadingScreen.java

	public static AssetManager manager;
	public static final String CHARS = "0123456789öüóqwertzuiopőúasdfghjkléáűíyxcvbnm'+!%/=()ÖÜÓQWERTZUIOPŐÚASDFGHJKLÉÁŰÍYXCVBNM?:_*<>#&@{}[],-.";


	static final FreetypeFontLoader.FreeTypeFontLoaderParameter fontParameter = new FreetypeFontLoader.FreeTypeFontLoaderParameter();
	static {
		fontParameter.fontFileName = "arial.ttf";
		fontParameter.fontParameters.size = 30;
		fontParameter.fontParameters.characters = CHARS;
		fontParameter.fontParameters.color = Color.WHITE;
	}
	public static final AssetDescriptor<BitmapFont> ARIAL_30_FONT
			= new AssetDescriptor<BitmapFont>(fontParameter.fontFileName, BitmapFont.class, fontParameter);



	public static final AssetDescriptor<Texture> BLUE_TEXTURE
			= new AssetDescriptor<Texture>("blue.png", Texture.class);

	public static final AssetDescriptor<Texture> GREEN_TEXTURE
			= new AssetDescriptor<Texture>("green.png", Texture.class);

	public static final AssetDescriptor<Texture> YELLOW_TEXTURE
			= new AssetDescriptor<Texture>("yellow.png", Texture.class);




	public static final AssetDescriptor<Texture> BACKGROUND_TEXTURE
			= new AssetDescriptor<Texture>("hatterek/backgroundShadow.png", Texture.class);

	public static final AssetDescriptor<Texture> KNOB_TEXTURE
			= new AssetDescriptor<Texture>("slider/knob.png", Texture.class);

	public static final AssetDescriptor<Texture> SLIDER_TEXTURE
			= new AssetDescriptor<Texture>("slider/slider.png", Texture.class);

	public static final AssetDescriptor<Texture> CANNON_TEXTURE
            = new AssetDescriptor<Texture>("actorok/cannonS.png", Texture.class);

    public static final AssetDescriptor<Texture> LOVEDEK_TEXTURE
            = new AssetDescriptor<Texture>("actorok/cannonBall.png", Texture.class);

    public static final AssetDescriptor<Texture> TENT_TEXTURE
            = new AssetDescriptor<Texture>("actorok/tentS.png", Texture.class);

	public static final AssetDescriptor<Texture> CASTLE_TEXTURE
			= new AssetDescriptor<Texture>("var/castle_dark.png", Texture.class);

	public static final AssetDescriptor<Texture> KATONA_TEXTURE
			= new AssetDescriptor<Texture>("projectek/soldierS.png", Texture.class);

	public static final AssetDescriptor<Texture> VAR3_TEXTURE
			= new AssetDescriptor<Texture>("var/castle_dmg3_dark.png", Texture.class);

	public static final AssetDescriptor<Texture> VAR2_TEXTURE
			= new AssetDescriptor<Texture>("var/castle_dmg2_dark.png", Texture.class);

	public static final AssetDescriptor<TextureAtlas> WALK_TEXTURE
			= new AssetDescriptor<TextureAtlas>("animacio/walk_02.atlas", TextureAtlas.class);

	public static final AssetDescriptor<TextureAtlas> RAVEN_TEXTURE
			= new AssetDescriptor<TextureAtlas>("animacio/hollo.atlas", TextureAtlas.class);

	public static final AssetDescriptor<Texture> VAR1_TEXTURE
			= new AssetDescriptor<Texture>("var/castle_dmg1_dark.png", Texture.class);

    public static final AssetDescriptor<Sound> HATTER_SOUND
            = new AssetDescriptor<Sound>("hangok/zene.wav", Sound.class);

	public static final AssetDescriptor<Sound> BECSAPODAS_SOUND
			= new AssetDescriptor<Sound>("hangok/impact_sound.wav", Sound.class);

	public static final AssetDescriptor<Sound> KILOVES_SOUND
			= new AssetDescriptor<Sound>("hangok/cannon_sound.wav", Sound.class);

	public static final AssetDescriptor<Sound> HOLLO_SOUND
			= new AssetDescriptor<Sound>("hangok/Raven_sound_.wav", Sound.class);

	public static final AssetDescriptor<Sound> HALAL_SOUND
			= new AssetDescriptor<Sound>("hangok/halal.wav", Sound.class);

	public static final AssetDescriptor<Sound> OSSZEOMLAS_SOUND
			= new AssetDescriptor<Sound>("hangok/osszeomlas.wav", Sound.class);

	public static final AssetDescriptor<Sound> SEBESULES_SOUND
			= new AssetDescriptor<Sound>("hangok/sebesules.wav", Sound.class);





	public static void prepare() {
		manager = new AssetManager();
		Texture.setAssetManager(manager);
	}

	public static void load() {
		FileHandleResolver resolver = new InternalFileHandleResolver();
		manager.setLoader(FreeTypeFontGenerator.class, new FreeTypeFontGeneratorLoader(resolver));
		manager.setLoader(BitmapFont.class, ".ttf", new FreetypeFontLoader(resolver));
		manager.setLoader(BitmapFont.class, ".otf", new FreetypeFontLoader(resolver));


		manager.load(ARIAL_30_FONT);
		manager.load(BACKGROUND_TEXTURE);
		manager.load(CASTLE_TEXTURE);
        manager.load(CANNON_TEXTURE);
        manager.load(LOVEDEK_TEXTURE);
        manager.load(TENT_TEXTURE);
		manager.load(VAR1_TEXTURE);
		manager.load(VAR2_TEXTURE);
		manager.load(VAR3_TEXTURE);
		manager.load(KNOB_TEXTURE);
		manager.load(SLIDER_TEXTURE);
		manager.load(WALK_TEXTURE);
		manager.load(RAVEN_TEXTURE);
		manager.load(KATONA_TEXTURE);
		manager.load(HATTER_SOUND);
		manager.load(KILOVES_SOUND);
		manager.load(BECSAPODAS_SOUND);
		manager.load(HOLLO_SOUND);
		manager.load(HALAL_SOUND);
		manager.load(OSSZEOMLAS_SOUND);
		manager.load(SEBESULES_SOUND);
		manager.load(KATONA_TEXTURE);
		manager.load(BLUE_TEXTURE);
		manager.load(GREEN_TEXTURE);
		manager.load(YELLOW_TEXTURE);

	}

    public static void afterLoaded() {
        //manager.get(MUSIC).setLooping(true);
    }

	public static void unload() {
		manager.dispose();
	}

}
