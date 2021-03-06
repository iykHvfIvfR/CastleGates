/**
 * @author Aleksey Terzi
 *
 */

package com.aleksey.castlegates.citadel;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.aleksey.castlegates.CastleGates;
import com.aleksey.castlegates.database.ReinforcementInfo;

public class NoCitadelManager implements ICitadelManager {
	public void init() {
		
	}
	
	public void close() {
		
	}
	
	public double getMaxRedstoneDistance() {
		return CastleGates.getConfigManager().getMaxRedstoneDistance();
	}
	
	public boolean canAccessDoors(List<Player> players, Location loc) {
		return true;
	}
	
	public boolean canBypass(Player player, Location loc) {
		return true;
	}
	
	public boolean canViewInformation(Player player, Location loc) {
		return true;
	}
	
	public ReinforcementInfo removeReinforcement(Location loc) {
		return null;
	}
	
	public boolean createReinforcement(ReinforcementInfo info, Location loc) {
		return false;
	}
}
