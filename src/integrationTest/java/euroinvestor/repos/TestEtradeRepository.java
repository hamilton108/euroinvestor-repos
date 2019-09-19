package euroinvestor.repos;

import euroinvestor.downloader.DownloaderStub;
import oahu.financial.html.EtradeDownloader;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class TestEtradeRepository {
    //private static String storePath = "/home/rcs/opt/java/nordnet-repos/src/integrationTest/resources/html/derivatives";
    private static String storePath = "c:/opt/lx/nordnet-repos/src/integrationTest/resources/html/derivatives";
    private StockMarketReposStub stockMarketRepos = new StockMarketReposStub();
    private EtradeDownloader downloader = new DownloaderStub(storePath);
    private EtradeRepositoryImpl repos;

    @Before
    public void init() {
        repos = new EtradeRepositoryImpl();
        //repos.setStorePath(storePath);

        stockMarketRepos = new StockMarketReposStub();
        repos.setStockMarketRepository(stockMarketRepos);

        EtradeDownloader downloader = new DownloaderStub(storePath);
        repos.setDownloader(downloader);
    }
}
