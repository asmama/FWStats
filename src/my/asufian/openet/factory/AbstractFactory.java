/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.asufian.openet.factory;

import my.asufian.openet.report.Stats;
import my.asufian.openet.report.ReportType;

/**
 *
 * @author asufian
 */
public abstract class AbstractFactory {
    public abstract Stats getStats(ReportType reportType);
}
