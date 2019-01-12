
class Task1 extends Thread {

	@Override
	public void run() { // Signature
		System.out.println("\nTask1 started");
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
			Thread.yield();

		}
		System.out.println("\n Task1 Done");

	}
}

//Second way of having multi-threading
class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("\nTask2 started");

		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");

		}
		System.out.println("\n Task2 Done");

	}

}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		/*
		 *
		 * Task1 started 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116
		 * 117 118 119 120 121 122 123 124 125 126 127 128 129 130 131 132 133 134 135
		 * 136 137 138 139 140 141 142 143 144 145 146 147 148 149 150 151 152 153 154
		 * 155 156 157 158 159 Task 3 kick off 301 302 303 304 160 161 162 163 164 Task2
		 * started 165 166 167 168 169 170 171 172 173 174 175 176 177 178 305 306 179
		 * 180 201 181 182 307 183 202 184 308 309 185 310 203 311 312 313 314 186 187
		 * 188 189 190 191 192 193 194 195 196 315 316 317 318 319 320 321 204 322 197
		 * 198 199 Task1 Done 205 206 207 208 323 324 209 210 211 212 213 325 326 214
		 * 327 328 329 330 215 216 217 331 218 332 333 334 335 336 337 338 339 340 341
		 * 342 219 220 343 344 221 222 223 224 225 226 227 228 229 230 345 346 231 232
		 * 347 348 349 350 351 352 233 234 235 236 353 354 355 356 357 358 359 360 361
		 * 362 363 237 238 239 240 364 241 242 365 366 243 367 368 244 369 370 371 245
		 * 372 373 246 374 247 248 249 250 375 251 252 376 377 378 253 379 380 381 382
		 * 383 384 385 386 387 388 389 390 391 392 393 394 395 396 397 398 254 399 255
		 * 256 Task3 Done 257 258 259 260 261 262 263 264 265 266 267 268 269 270 271
		 * 272 273 274 275 276 277 278 279 280 281 282 283 284 285 286 287 288 289 290
		 * 291 292 293 294 295 296 297 298 299 Task2 Done
		 *
		 */

		// States

		// New;
		// (When task1 task1 = new Task1();, the task1 thread is ready but not executed
		// at yet. this state is called new)

		// Runnable;
		// Running
		// Blocked/waiting
		// terminated/dead

		// Task 1
		Task1 task1 = new Task1();
		task1.setPriority(10);
		task1.start(); // Use start when want to kick off task1 as a thread.

		// Task 2
		Task2 task2 = new Task2();
		Thread thread2Thread = new Thread(task2); // If using a runnable interface, you need to create a thread class.
		thread2Thread.start(); // after creating the thread class and passing in the instance, then .start();

		// Wait for task1 to complete before kicking off task3.
		task1.join();

		// to check if both task are completed before kicking off.
		thread2Thread.join();

		// Task 3
		System.out.println("\nIn Main Metjod: Task 3 kick off");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");

		}
		System.out.println("\n Task3 Done");
	}

}
