package axfr;

import org.xbill.DNS.Name;
import org.xbill.DNS.Record;
import org.xbill.DNS.Zone;
import org.xbill.DNS.ZoneTransferIn;

public class ZoneBuilderAxfrHandler implements ZoneTransferIn.ZoneTransferHandler
{
    private final ZoneFileBuilder zoneFileBuilder;

    public ZoneBuilderAxfrHandler(Name zone)
    {
        zoneFileBuilder = ZoneBuilder.empty( zone );
    }

    public Zone getZone()
    {
        return zoneFileBuilder.zone();
    }

    @Override
    public void startAXFR() {}

    @Override
    public void startIXFR() {}

    @Override
    public void startIXFRDeletes( Record soa ) {}

    @Override
    public void startIXFRAdds( Record soa ) {}

    @Override
    public void handleRecord( Record r )
    {
        zoneFileBuilder.add( r );
    }
}
