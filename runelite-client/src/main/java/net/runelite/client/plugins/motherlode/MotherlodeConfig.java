/*
 * Copyright (c) 2018, Seth <Sethtroll3@gmail.com>
 * Copyright (c) 2018, Lars <lars.oernlo@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.motherlode;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("motherlode")
public interface MotherlodeConfig extends Config
{
	@ConfigItem(
		keyName = "showRocks",
		name = "Show pay-dirt mining spots",
		description = "Configures whether or not the pay-dirt mining spots are displayed."
	)
	default boolean showRocks()
	{
		return true;
	}

	@ConfigItem(
		keyName = "statTimeout",
		name = "Reset stats (minutes)",
		description = "Configures the time until statistics are reset"
	)
	default int statTimeout()
	{
		return 5;
	}

	@ConfigItem(
		keyName = "showSack",
		name = "Show pay-dirt sack",
		description = "Configures whether the pay-dirt sack is displayed or not."
	)
	default boolean showSack()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showMiningStats",
		name = "Show mining session stats",
		description = "Configures whether to display mining session stats"
	)
	default boolean showMiningStats()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showDepositsLeft",
		name = "Show deposits left",
		description = "Displays deposits left before sack is full"
	)
	default boolean showDepositsLeft()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showMiningState",
		name = "Show current mining state",
		description = "Shows current mining state. 'You are currently mining' / 'You are currently NOT mining'"
	)
	default boolean showMiningState()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showGemsFound",
		name = "Show gems found",
		description = "Shows gems found during current mining session"
	)
	default boolean showGemsFound()
	{
		return true;
	}
}
