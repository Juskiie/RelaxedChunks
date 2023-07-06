package hoosk.relaxedchunks.handlers;

import hoosk.relaxedchunks.RelaxedChunks;
import org.bukkit.Chunk;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerLoadingChunks implements Listener {
    private final RelaxedChunks relaxedChunks;

    public PlayerLoadingChunks(RelaxedChunks relaxedChunks) {
        this.relaxedChunks = relaxedChunks;
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();

        Chunk fromChunk = event.getFrom().getChunk();
        Chunk toChunk = event.getTo().getChunk();

        if(!fromChunk.equals(toChunk)) {
            // Player moved to new chunk!
            // Put relaxed chunk loading logic here!
        }
    }
}
