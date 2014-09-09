/**
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2014 SpongePowered <http://spongepowered.org/>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.world;

import org.spongepowered.api.block.Block;

/**
 * Represents a 3-dimensional position in a {@link World}
 */
public class Location implements Cloneable {

	private World world;
	private double x;
	private double y;
	private double z;
	private float pitch;
	private float yaw;

	public Location(World world, double x, double y, double z) {
		this(world, x, y, z, 0, 0);
	}

	public Location(World world, double x, double y, double z, float pitch) {
		this(world, x, y, z, pitch, 0);
	}

	public Location(World world, double x, double y, double z, float pitch, float yaw) {
		this.world = world;
		this.x = x;
		this.y = y;
		this.z = z;
		this.pitch = pitch;
		this.yaw = yaw;
	}

	public int getBlockX() {
		return (int) x; // TODO
	}

	public int getBlockY() {
		return (int) y; // TODO
	}

	public int getBlockZ() {
		return (int) z; // TODO
	}

	/**
	 * Gets the world that this location resides in
	 *
	 * @return World that contains this location
	 */
	public World getWorld() {
		return world;
	}

	/**
	 * Gets the block at the represented location
	 *
	 * @return Block at the represented location
	 */
	public Block getBlock() {
		return world.getBlock(getBlockX(), getBlockY(), getBlockZ());// TODO
	}

	/**
	 * Gets the chunk at the represented location
	 *
	 * @return Chunk at the represented location
	 */
	public Chunk getChunk() {
		return world.getChunk(getBlockX() >> 4, getBlockZ() >> 4);// TODO
	}

	/**
	 * Sets the world that this location resides in
	 *
	 * @param world
	 *            New world that this location resides in
	 */
	public void setWorld(World world) {
		this.world = world;
	}

	/**
	 * Gets the x-coordinate of this location
	 *
	 * @return x-coordinate
	 */
	public double getX() {
		return x;
	}

	/**
	 * Sets the x-coordinate of this location
	 *
	 * @param x
	 *            X-coordinate
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * Gets the y-coordinate of this location
	 *
	 * @return y-coordinate
	 */
	public double getY() {
		return y;
	}

	/**
	 * Sets the y-coordinate of this location
	 *
	 * @param y
	 *            y-coordinate
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * Gets the z-coordinate of this location
	 *
	 * @return z-coordinate
	 */
	public double getZ() {
		return z;
	}

	/**
	 * Sets the z-coordinate of this location
	 *
	 * @param z
	 *            z-coordinate
	 */
	public void setZ(double z) {
		this.z = z;
	}

	/**
	 * Gets the pitch of this location
	 *
	 * @return Pitch
	 */
	public float getPitch() {
		return pitch;
	}

	/**
	 * Sets the pitch of this location
	 *
	 * @param pitch
	 *            New pitch
	 */
	public void setPitch(float pitch) {
		this.pitch = pitch;
	}

	/**
	 * Gets the yaw of this location
	 *
	 * @return Yaw
	 */
	public float getYaw() {
		return yaw;
	}

	/**
	 * Sets the yaw of this location
	 *
	 * @param yaw
	 *            New yaw
	 */
	public void setYaw(float yaw) {
		this.yaw = yaw;
	}
}
