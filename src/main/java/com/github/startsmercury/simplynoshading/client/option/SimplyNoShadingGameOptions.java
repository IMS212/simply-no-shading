package com.github.startsmercury.simplynoshading.client.option;

import static net.fabricmc.api.EnvType.CLIENT;

import net.fabricmc.api.Environment;
import net.minecraft.client.Options;
import net.minecraft.client.KeyMapping;

/**
 * Contains extensions to the class {@link Options}.
 * <p>
 * <table border=1 style="margin:0;padding:0;">
 * <tr>
 * <td align=center>keyCycleShadeAll</td>
 * <td align=center colspan=2>{@link #keyCycleShadeAll() get}</td>
 * </tr>
 * <tr>
 * <td align=center>keyCycleShadeBlocks</td>
 * <td align=center colspan=2>{@link #keyCycleShadeBlocks() get}</td>
 * </tr>
 * <tr>
 * <td align=center>keyCycleShadeClouds</td>
 * <td align=center colspan=2>{@link #keyCycleShadeClouds() get}</td>
 * </tr>
 * <tr>
 * <td align=center>keyCycleShadeFluids</td>
 * <td align=center colspan=2>{@link #keyCycleShadeFluids() get}</td>
 * </tr>
 * <tr>
 * <td align=center>shadeAll</td>
 * <td align=center>{@link #isShadeAll() get}</td>
 * <td align=center>{@link #setShadeAll(boolean) set</td>
 * </tr>
 * <tr>
 * <td align=center>shadeBlocks</td>
 * <td align=center>{@link #isShadeBlocks() get}</td>
 * <td align=center>{@link #setShadeBlocks(boolean) set</td>
 * </tr>
 * <tr>
 * <td align=center>shadeClouds</td>
 * <td align=center>{@link #isShadeClouds() get}</td>
 * <td align=center>{@link #setShadeClouds(boolean) set</td>
 * </tr>
 * <tr>
 * <td align=center>shadeFluids</td>
 * <td align=center>{@link #isShadeFluids() get}</td>
 * <td align=center>{@link #setShadeFluids(boolean) set</td>
 * </tr>
 * </table>
 */
@Environment(CLIENT)
public interface SimplyNoShadingGameOptions {
	/**
	 * Cycles through the next values for the property shadeAll.
	 * <p>
	 * All possible values are just {@code false} and {@code true}.
	 *
	 * @see #isShadeAll()
	 * @see #setShadeAll(boolean)
	 */
	default void cycleShadeAll() {
		setShadeAll(!isShadeAll());
	}

	/**
	 * Cycles through the next values for the property shadeBlocks.
	 * <p>
	 * All possible values are just {@code false} and {@code true}.
	 *
	 * @see #isShadeBlocks()
	 * @see #setShadeBlocks(boolean)
	 */
	default void cycleShadeBlocks() {
		setShadeBlocks(!isShadeBlocks());
	}

	/**
	 * Cycles through the next values for the property shadeClouds.
	 * <p>
	 * All possible values are just {@code false} and {@code true}.
	 *
	 * @see #isShadeClouds()
	 * @see #setShadeClouds(boolean)
	 */
	default void cycleShadeClouds() {
		setShadeClouds(!isShadeClouds());
	}

	/**
	 * Cycles through the next values for the property shadeFluids.
	 * <p>
	 * All possible values are just {@code false} and {@code true}.
	 *
	 * @see #isShadeFluids()
	 * @see #setShadeFluids(boolean)
	 */
	default void cycleShadeFluids() {
		setShadeFluids(!isShadeFluids());
	}

	/**
	 * Getter for the property shadeAll.
	 *
	 * @return the value of the property shadeAll
	 * @see #setShadeAll(boolean)
	 */
	boolean isShadeAll();

	/**
	 * Getter for the property shadeBlocks.
	 *
	 * @return the value of the property shadeBlocks
	 * @see #setShadeBlocks(boolean)
	 */
	boolean isShadeBlocks();

	/**
	 * Getter for the property shadeClouds.
	 *
	 * @return the value of the property shadeCLouds
	 * @see #setShadeClouds(boolean)
	 */
	boolean isShadeClouds();

	/**
	 * Getter for the property shadeFluids.
	 *
	 * @return the value of the property shadeFluids
	 * @see #setShadeFluids(boolean)
	 */
	boolean isShadeFluids();

	/**
	 * Accessor for the property keyCycleShadeAll.
	 *
	 * @return the constant reference of the property keyCycleShadeAll
	 */
	KeyMapping keyCycleShadeAll();

	/**
	 * Accessor for the property keyCycleShadeBlocks.
	 *
	 * @return the constant reference of the property keyCycleShadeBlocks
	 */
	KeyMapping keyCycleShadeBlocks();

	/**
	 * Accessor for the property keyCycleShadeClouds.
	 *
	 * @return the constant reference of the property keyCycleShadeClouds
	 */
	KeyMapping keyCycleShadeClouds();

	/**
	 * Accessor for the property keyCycleShadeFluids.
	 *
	 * @return the constant reference of the property keyCycleShadeFluids
	 */
	KeyMapping keyCycleShadeFluids();

	/**
	 * Setter for the property shadeAll.
	 *
	 * @param shadeAll the new value
	 * @see SimplyNoShadingGameOptions#isShadeAll()
	 */
	void setShadeAll(boolean shadeAll);

	/**
	 * Setter for the property shadeBlocks.
	 *
	 * @param shadeBlocks the new value
	 * @see #isShadeBlocks()
	 */
	void setShadeBlocks(boolean shadeBlocks);

	/**
	 * Setter for the property shadeClouds.
	 *
	 * @param shadeClouds the new value
	 * @see #isShadeClouds()
	 */
	void setShadeClouds(boolean shadeClouds);

	/**
	 * Setter for the property shadeFluids.
	 *
	 * @param shadeFluids the new value
	 * @see #isShadeFluids()
	 */
	void setShadeFluids(boolean shadeFluids);
}
