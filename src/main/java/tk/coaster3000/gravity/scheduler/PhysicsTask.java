/**
 * Copyright 2017 Coaster3000 (Christopher Krier)
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package tk.coaster3000.gravity.scheduler;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


abstract class PhysicsTask implements Comparable<PhysicsTask> {

	final World world;
	final BlockPos position;
	final PhysicsScheduler scheduler;

	PhysicsTask(PhysicsScheduler scheduler, World world, BlockPos position) {
		this.scheduler = scheduler;
		this.world = world;
		this.position = position;
	}

	abstract void execute();
}
