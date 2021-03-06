package tb.service;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Service;

import tb.car.CarOptionsSynch;
import tb.car.CarSynch;

@Service
public class Starter {
	@Autowired
	private CarSynch carSynch;
	// @Autowired
	// private TariffSynch tariffSynch;
	@Autowired
	private CarOptionsSynch carOptionsSynch;

	private ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();

	@Value("#{mainSettings['starter.runsynch.seconds']}")
	private Integer runsynchSeconds;

	@PostConstruct
	public void start() {
		taskScheduler.initialize();
		Date d = new Date(new Date().getTime() + (runsynchSeconds * 1000));

		taskScheduler.schedule(carSynch::synch, d);
		// taskScheduler.schedule(tariffSynch::synch, d);
		taskScheduler.schedule(carOptionsSynch::synch, d);
	}

	@PreDestroy
	public void stop() {
		taskScheduler.shutdown();
		taskScheduler.destroy();
	}

	public void schedule(Runnable task, Date startTime) {
		taskScheduler.schedule(task, startTime);
	}
}
