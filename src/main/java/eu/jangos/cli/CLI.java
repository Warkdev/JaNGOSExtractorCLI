/*
 * Copyright (C) 2019 Warkdev
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package eu.jangos.cli;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Warkdev
 */
public class CLI {
    
    private static final Logger logger = LoggerFactory.getLogger(CLI.class);
    
    /**
     * Main class of the extractorCLI.
     * @param args 
     */
    public static void main(String[] args) {
        logger.info("CLI started!");
        
        logger.info("CLI ended");
    }
}
