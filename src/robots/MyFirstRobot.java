
package robots;
import robocode.*;

import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.HitByBulletEvent;

public class MyFirstRobot extends Robot 
{
	public void run() {
		while (true) {
			ahead(100); // Move ahead 100
			turnGunRight(360); // Spin gun around
			back(100); // Move back 100
			turnGunRight(360); // Spin gun around
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}

	public void onHitByBullet(HitByBulletEvent e) {
		turnLeft(90 - e.getBearing());
	}
}												

